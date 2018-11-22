package de.ropemc.api.wrapper;


import de.ropemc.Mappings;
import de.ropemc.api.exceptions.MissingAnnotationException;
import de.ropemc.api.exceptions.WrongTypeException;
import de.ropemc.utils.Mapping;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.*;

public class WrapperSystem {
    private Map<Method, Method> methods = new HashMap<>();
    private static Map<Class<?>, WrapperSystem> classWrappers = new HashMap<>();
    private Map<Object, Object> handles = new HashMap<>();

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
        Object obj = Proxy.newProxyInstance(calledFromClass.getClassLoader(), new Class[]{calledFromClass}, (proxy, method, args) ->
        {
            int index = 0;
            for (Object argObj : args) {
                if (argObj.getClass().isInterface() && argObj.getClass().isAnnotationPresent(WrappedClass.class)) {
                    args[index] = handles.get(proxy);
                }

                index++;
            }

            Method targetMethod = methods.get(method);

            if (method.getReturnType().isInterface() && method.getReturnType().isAnnotationPresent(WrappedClass.class)) {
                return classWrappers.get(method.getReturnType()).createInstance(targetMethod.invoke(handle, args));
            }

            return targetMethod.invoke(handle, args);
        });

        handles.put(obj, handle);

        return obj;
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
