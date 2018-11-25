package de.ropemc.api.wrapper;


import de.ropemc.Mappings;
import de.ropemc.api.exceptions.MissingAnnotationException;

import java.lang.reflect.*;
import java.util.*;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WrapperSystem {
    private static Map<Method, Method> methods = new HashMap<>();
    private static Map<Class<?>, WrapperSystem> classWrappers = new HashMap<>();

    private Class<?> calledFromClass;

    private WrapperSystem(Class<?> clazz) {
        this.calledFromClass = clazz;
        scanMethods();
        classWrappers.put(clazz, this);
    }

    private void scanMethods() {
        if (this.calledFromClass.isAnnotationPresent(WrappedClass.class)) {
            WrappedClass annotation = this.calledFromClass.getAnnotation(WrappedClass.class);
            for (Method method : Arrays.stream(this.calledFromClass.getDeclaredMethods()).filter(m -> !Modifier.isStatic(m.getModifiers())).collect(Collectors.toList())) {
                method.setAccessible(true);
                try {
                    Class<?> mcpClass = Class.forName(Mappings.getClassName(annotation.value()));
                    if(mcpClass==null)
                        continue;
                    Class[] parameterTypes = method.getParameterTypes();
                    int index = 0;
                    for (Class<?> argObj : method.getParameterTypes()) {
                        if (argObj.isInterface() && argObj.isAnnotationPresent(WrappedClass.class)) {
                            parameterTypes[index] = Class.forName(Mappings.getClassName(argObj.getAnnotation(WrappedClass.class).value()));
                        }
                        index++;
                    }
                    String mcpMethodName = Mappings.getMethodName(annotation.value(), method.getName());
                    if (mcpMethodName != null) {
                        Method mcpMethod = mcpClass.getDeclaredMethod(mcpMethodName, parameterTypes);
                        mcpMethod.setAccessible(true);
                        methods.put(method, mcpMethod);
                    }
                } catch (ClassNotFoundException | NoSuchMethodException e) { }
            }
        }
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
            public Field getField(String fieldName) throws NoSuchFieldException {
                if (getHandle().getClass().isAnnotationPresent(WrappedClass.class)) {
                    Field field = getHandle().getClass().getDeclaredField(Mappings.getFieldName(getHandle().getClass().getAnnotation(WrappedClass.class).value(), fieldName));
                    field.setAccessible(true);
                    return field;
                }

                return null;
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
                if (targetMethod != null) {
                    Object newHandle = targetMethod.invoke(getHandle(), args);
                    if (method.getReturnType().isInterface() && method.getReturnType().isAnnotationPresent(WrappedClass.class)) {
                        return classWrappers.get(method.getReturnType()).createInstance(newHandle);
                    }
                    return newHandle;
                }

                return null;
            }
        });
    }

    public static void init() {
        Mappings.getMappings().getClasses()
                .keySet()
                .stream()
                .filter(className -> !className.contains("$"))
                .filter(className -> doesClassExist(className) != null)
                .map(WrapperSystem::doesClassExist)
                .forEach(WrapperSystem::new);
    }

    private static Class doesClassExist(String className) {
        try {
            return Class.forName("de.ropemc.api.wrapper." + className);
        } catch (ClassNotFoundException e) {}

        return null;
    }

    public static Object construct(Class<?> self, Object... args) {
        try {
            if (self.isAnnotationPresent(WrappedClass.class)) {
                Constructor constructor = Class.forName(Mappings.getClassName(self.getAnnotation(WrappedClass.class).value())).getDeclaredConstructor(Stream.of(args).map(arg -> arg.getClass()).toArray((IntFunction<Class<?>[]>) Class[]::new));
                constructor.setAccessible(true);
                Object handle = constructor.newInstance(args);
                return classWrappers.get(self).createInstance(handle);
            } else {
                throw new MissingAnnotationException("No Constructor in " + self.getName());
            }
        } catch (MissingAnnotationException | ClassNotFoundException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            System.out.println("NO CONSTRUCTOR FOUND !");
            e.printStackTrace();
        }

        return null;
    }

    public static WrapperSystem getWrapperSystem(Class<?> clazz) {
        return classWrappers.get(clazz);
    }
}
