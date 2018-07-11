package de.ropemc.api.wrapper;


import de.ropemc.Mappings;
import de.ropemc.api.exceptions.MissingAnnotationException;
import de.ropemc.api.exceptions.WrongTypeException;
import de.ropemc.utils.Mapping;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.*;

public class WrapperSystem
{
    private Map<Method, Method> methods = new HashMap<>();
    private Map<Method, Field> fieldMethods = new HashMap<>();
    private static Map<Class<?>, WrapperSystem> classWrappers = new HashMap<>();
    private Map<Object, Object> handles = new HashMap<>();

    private Class<?> calledFromClass;

    public WrapperSystem(Class<?> clazz) throws MissingAnnotationException
    {
        this.calledFromClass = clazz;

        addMethodsViaClassTree(calledFromClass);
    }

    /**
     * Creates an instance which will be "redirected" to the Minecraft Code
     *
     * @param handle the instance Object
     * @return the return value of the Minecraft code
     */
    public Object createInstance(Object handle)
    {
        Object obj = Proxy.newProxyInstance(calledFromClass.getClassLoader(), new Class[]{calledFromClass}, (proxy, method, args) ->
        {
            if (method.isAnnotationPresent(WrappedField.Getter.class))
            {
                Field targetField = fieldMethods.get(method);
                if (method.getReturnType() == targetField.getType())
                {
                    return targetField.get(handle);
                }
                else if(method.getReturnType().isInterface())
                {
                    return classWrappers.get(method.getReturnType()).createInstance(targetField.get(handle));
                }
                else
                {
                    throw new WrongTypeException("In Class: " + method.getDeclaringClass().getName() + " with Getter Field: " + targetField.getName());
                }
            }
            else if (method.isAnnotationPresent(WrappedField.Setter.class))
            {
                Field targetField = fieldMethods.get(method);
                if (method.getParameterTypes()[0] == targetField.getType())
                {
                    targetField.set(handle, args[0]);

                    return null;
                }
                else
                {
                    throw new WrongTypeException("In Class: " + method.getDeclaringClass().getName() + " with Setter Field: " + targetField.getName());
                }
            }
            else
            {
                int index = 0;
                for(Object argObj : args)
                {
                    if(argObj.getClass().isInterface() && argObj.getClass().isAnnotationPresent(WrappedClass.class))
                    {
                        args[index] = handles.get(proxy);
                    }

                    index++;
                }

                Method targetMethod = methods.get(method);

                if (method.getReturnType().isInterface() && method.getReturnType().isAnnotationPresent(WrappedClass.class))
                {
                    return classWrappers.get(method.getReturnType()).createInstance(targetMethod.invoke(handle, args));
                }

                return targetMethod.invoke(handle, args);
            }
        });

        handles.put(obj, handle);

        return obj;
    }

    private void addMethodsViaClassTree(Class<?> clazz) throws MissingAnnotationException
    {
        if (clazz.isAnnotationPresent(WrappedClass.class))
        {
            try
            {
                Class mcpClass = Class.forName(Mappings.getClassName(clazz.getAnnotation(WrappedClass.class).value()));
                for (Method meths : clazz.getDeclaredMethods())
                {
                    if (meths.isAnnotationPresent(WrappedField.Getter.class))
                    {
                        WrappedField.Getter getterAnnotation = meths.getAnnotation(WrappedField.Getter.class);
                        Field targetField = mcpClass.getDeclaredField(Mappings.getFieldName(clazz.getAnnotation(WrappedClass.class).value(), getterAnnotation.value()));
                        targetField.setAccessible(true);

                        fieldMethods.put(meths, targetField);
                    }
                    else if (meths.isAnnotationPresent(WrappedField.Setter.class))
                    {
                        WrappedField.Setter setterAnnotation = meths.getAnnotation(WrappedField.Setter.class);
                        Field targetField = mcpClass.getDeclaredField(Mappings.getFieldName(clazz.getAnnotation(WrappedClass.class).value(), setterAnnotation.value()));
                        targetField.setAccessible(true);

                        fieldMethods.put(meths, targetField);
                    }
                    else
                    {
                        Class<?>[] parameters = meths.getParameterTypes();
                        int index = 0;
                        for(Class<?> paramClazz : parameters)
                        {
                            if(paramClazz.isInterface() && paramClazz.isAnnotationPresent(WrappedClass.class))
                            {
                                parameters[index] = Class.forName(Mappings.getClassName(paramClazz.getAnnotation(WrappedClass.class).value()));
                            }

                            index ++;
                        }

                        Method targetMethod = mcpClass.getDeclaredMethod(Mappings.getMethodName(clazz.getAnnotation(WrappedClass.class).value(), meths.getName()), parameters);
                        targetMethod.setAccessible(true);

                        if (meths.getReturnType().isInterface() && meths.getReturnType().isAnnotationPresent(WrappedClass.class))
                        {
                            if (!classWrappers.containsKey(meths.getReturnType()))
                            {
                                classWrappers.put(meths.getReturnType(), new WrapperSystem(meths.getReturnType()));
                            }
                        }

                        methods.put(meths, targetMethod);
                    }
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }

        }
        else
        {
            throw new MissingAnnotationException("Missing Annotation: " + WrappedClass.class.getName() + " in Class: " + calledFromClass.getName());
        }

        if (clazz.getInterfaces().length != 0)
        {
            addMethodsViaClassTree(clazz.getInterfaces()[0]);
        }
    }
}
