package de.ropemc.api.inject;

import de.ropemc.Mappings;
import de.ropemc.api.wrapper.WrappedClass;
import de.ropemc.api.wrapper.WrapperSystem;
import de.ropemc.api.wrapper.net.minecraft.client.entity.EntityPlayerSP;
import de.ropemc.utils.Mapping;
import javassist.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.IOException;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.reflect.Method;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InjectionTransformer implements ClassFileTransformer {
    private Map<String, Class<?>> injectors = new HashMap<>();

    public InjectionTransformer(List<Class<?>> injectors) {
        for (Class<?> injector : injectors) {
            this.injectors.put(Mappings.getClassName(injector.getAnnotation(Inject.class).value().getAnnotation(WrappedClass.class).value()), injector);
        }
    }

    /**
     * called when a class is transformed
     *
     * @param classLoader
     * @param s                (obfuscated) name of the class which is transformed
     * @param aClass           instance of the class which is transformed
     * @param protectionDomain
     * @param bytes            bytecode of class
     * @return the bytecode to transform, if null nothing will happen
     * @throws IllegalClassFormatException
     */
    public byte[] transform(ClassLoader classLoader, String s, Class<?> aClass, ProtectionDomain protectionDomain, byte[] bytes) throws IllegalClassFormatException {
        ClassPool cp = ClassPool.getDefault();
        Class<?> injectionPoint = this.injectors.get(s);
        if (injectionPoint != null) {
            try {
                CtClass cc = cp.get(s);
                for (Method method : injectionPoint.getDeclaredMethods()) {
                    method.setAccessible(true);
                    if (method.isAnnotationPresent(Inject.At.class) || method.isAnnotationPresent(Inject.End.class) || method.isAnnotationPresent(Inject.Start.class)) {
                        CtMethod injectMethod = cc.getDeclaredMethod(Mappings.getMethodName(injectionPoint.getAnnotation(Inject.class).value().getAnnotation(WrappedClass.class).value(), method.getName()));
                        String insertString = (injectionPoint.getName() + "." + method.getName() + "();").replace('$', '.');
                        if (method.isAnnotationPresent(Inject.At.class)) {
                            Inject.At annotation = method.getAnnotation(Inject.At.class);
                            injectMethod.insertAt(annotation.value(), insertString);
                        } else if (method.isAnnotationPresent(Inject.End.class)) {
                            injectMethod.insertAfter(insertString);
                        } else if (method.isAnnotationPresent(Inject.Start.class)) {
                            injectMethod.insertBefore(insertString);
                        }
                    }
                }

                byte[] byteCode = cc.toBytecode();
                cc.detach();
                return byteCode;
            } catch (NotFoundException | CannotCompileException | IOException e) {
                e.printStackTrace();
            }
        }

        if (Mappings.getClassName("net.minecraft.client.entity.EntityPlayerSP").equals(s)) {
            try {
                cp = ClassPool.getDefault();
                CtClass cc = cp.get(Mappings.getClassName("net.minecraft.client.entity.EntityPlayerSP"));
                CtMethod m1 = cc.getDeclaredMethod(Mappings.getMethodName("net.minecraft.client.entity.EntityPlayerSP", "sendChatMessage"));
                CtMethod m = cc.getDeclaredMethod(Mappings.getMethodName("net.minecraft.client.entity.EntityPlayerSP", "onLivingUpdate"));
                m.insertBefore("de.ropemc.api.event.EventManager.callEvent(new de.ropemc.api.event.player.PlayerUpdateEvent());");
                m1.insertBefore("de.ropemc.api.event.chat.ChatEvent event = new de.ropemc.api.event.chat.ChatEvent($1);" +
                        "de.ropemc.api.event.EventManager.callEvent(event);" +
                        "$1 = event.getMessage();" +
                        "if (event.isCancelled()) return;");
                byte[] byteCode = cc.toBytecode();
                cc.detach();
                return byteCode;
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        return null;
    }
}
