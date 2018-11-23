package de.ropemc.api.wrapper;


import de.ropemc.Mappings;
import de.ropemc.api.exceptions.MissingAnnotationException;
import de.ropemc.api.exceptions.WrongTypeException;
import de.ropemc.utils.Mapping;
import jdk.internal.org.objectweb.asm.Handle;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.*;

public class WrapperSystem {
    private Map<Method, Method> methods = new HashMap<>();
    static Map<Class<?>, WrapperSystem> classWrappers = new HashMap<>();

    private Class<?> calledFromClass;

    public WrapperSystem(Class<?> clazz) throws MissingAnnotationException {
        this.calledFromClass = clazz;

        addMethodsViaClassTree(calledFromClass);
    }

    /**
     * Creates an instance which will be "redirected" to the Minecraft Code
     *
     * @param handle the instance Object
     * @return the return value of the Minecraft code
     */
    public Object createInstance(Object handle) {
        return Proxy.newProxyInstance(calledFromClass.getClassLoader(), new Class[]{calledFromClass}, new HandledInvocationHandler() {
            private Object theHandle = handle;

            @Override
            public Object getHandle() {
                return theHandle;
            }

            @Override
            public Object invoke(Object proxy, Method method, Object... args) throws Throwable {
                int index = 0;
                if (args != null) {
                    for (Object argObj : args) {
                        if (method.getParameterTypes()[index].isInterface() && method.getParameterTypes()[index].isAnnotationPresent(WrappedClass.class)) {
                            HandledInvocationHandler handler = (HandledInvocationHandler) Proxy.getInvocationHandler(argObj);
                            args[index] = handler.getHandle();
                        }

                        index++;
                    }
                }
                Method targetMethod = methods.get(method);

                Object newHandle = targetMethod.invoke(getHandle(), args);
                System.out.println(newHandle);
                if (method.getReturnType().isInterface() && method.getReturnType().isAnnotationPresent(WrappedClass.class)) {
                    return classWrappers.get(method.getReturnType()).createInstance(newHandle);
                }
                return newHandle;
            }
        });
    }

    private void addMethodsViaClassTree(Class<?> clazz) throws MissingAnnotationException {
        if (clazz.isAnnotationPresent(WrappedClass.class)) {
            try {
                Class mcpClass = Class.forName(Mappings.getClassName(clazz.getAnnotation(WrappedClass.class).value()));
                for (Method meths : clazz.getDeclaredMethods()) {
                          Class<?>[] parameters = meths.getParameterTypes();
                    int index = 0;
                    for (Class<?> paramClazz : parameters) {
                        if (paramClazz.isInterface() && paramClazz.isAnnotationPresent(WrappedClass.class)) {
                            parameters[index] = Class.forName(Mappings.getClassName(paramClazz.getAnnotation(WrappedClass.class).value()));
                        }

                        index++;
                    }

                    Method targetMethod = mcpClass.getDeclaredMethod(Mappings.getMethodName(clazz.getAnnotation(WrappedClass.class).value(), meths.getName()), parameters);
                    targetMethod.setAccessible(true);

                    if (meths.getReturnType().isInterface() && meths.getReturnType().isAnnotationPresent(WrappedClass.class)) {
                        if (!classWrappers.containsKey(meths.getReturnType())) {
                            classWrappers.put(meths.getReturnType(), new WrapperSystem(meths.getReturnType()));
                        }
                    }

                    methods.put(meths, targetMethod);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            throw new MissingAnnotationException("Missing Annotation: " + WrappedClass.class.getName() + " in Class: " + calledFromClass.getName());
        }

        if (clazz.getInterfaces().length != 0) {
            addMethodsViaClassTree(clazz.getInterfaces()[0]);
        }
    }
}
