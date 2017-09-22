package de.ropemc;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;

public class Transformer implements ClassFileTransformer {

    public byte[] transform(ClassLoader classLoader, String s, Class<?> aClass, ProtectionDomain protectionDomain, byte[] bytes) throws IllegalClassFormatException
    {
        if("org/lwjgl/opengl/Display".equals(s))
        {
            try {
                ClassPool cp = ClassPool.getDefault();
                CtClass cc = cp.get("org.lwjgl.opengl.Display");
                CtMethod m = cc.getDeclaredMethod("setTitle");
                m.insertBefore("{de.ropemc.Hooks.titleHook(newTitle);return;}");
                byte[] byteCode = cc.toBytecode();
                cc.detach();
                return byteCode;
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if(Mappings.getClassName("net.minecraft.client.entity.EntityPlayerSP").equals(s))
        {
            try {
                ClassPool cp = ClassPool.getDefault();
                CtClass cc = cp.get(Mappings.getClassName("net.minecraft.client.entity.EntityPlayerSP"));
                CtMethod m = cc.getDeclaredMethod(Mappings.getMethodName("net.minecraft.client.entity.EntityPlayerSP", "onLivingUpdate"));
                m.insertBefore("de.ropemc.event.EventManager.callEvent(new de.ropemc.event.player.PlayerUpdateEvent());");
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
