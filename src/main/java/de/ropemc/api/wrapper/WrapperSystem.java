package de.ropemc.api.wrapper;


import de.ropemc.Mappings;
import de.ropemc.api.exceptions.MissingAnnotationException;
import de.ropemc.api.exceptions.WrongTypeException;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class WrapperSystem
{
    private Map<Method, Method> methods = new HashMap<>();
    private Map<Method, Field> fieldMethods = new HashMap<>();
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
        return Proxy.newProxyInstance(calledFromClass.getClassLoader(), new Class[]{calledFromClass}, (proxy, method, args) ->
        {
            if(method.isAnnotationPresent(WrappedField.Getter.class))
            {
                Field targetField = fieldMethods.get(method);
                if(method.getReturnType() == targetField.getType())
                {
                    return targetField.get(handle);
                }
                else
                {
                    throw new WrongTypeException("In Class: " + method.getDeclaringClass().getName() + " with Getter Field: " + targetField.getName());
                }
            }
            else if(method.isAnnotationPresent(WrappedField.Setter.class))
            {
                Field targetField = fieldMethods.get(method);
                if(method.getParameterTypes()[0] == targetField.getType())
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
                Method targetMethod = methods.get(method);

                return targetMethod.invoke(handle, args);
            }
        });
    }

    private void addMethodsViaClassTree(Class<?> clazz) throws MissingAnnotationException
    {
        if(clazz.isAnnotationPresent(WrappedClass.class))
        {
            try
            {
                Class mcpClass = Class.forName(Mappings.getClassName(clazz.getAnnotation(WrappedClass.class).value()));
                for (Method meths : clazz.getDeclaredMethods())
                {
                    if(meths.isAnnotationPresent(WrappedField.Getter.class))
                    {
                        WrappedField.Getter getterAnnotation = meths.getAnnotation(WrappedField.Getter.class);
                        Field targetField = mcpClass.getDeclaredField(Mappings.getFieldName(clazz.getAnnotation(WrappedClass.class).value(), getterAnnotation.value()));
                        targetField.setAccessible(true);

                        fieldMethods.put(meths, targetField);
                    }
                    else if(meths.isAnnotationPresent(WrappedField.Setter.class))
                    {
                        WrappedField.Setter setterAnnotation = meths.getAnnotation(WrappedField.Setter.class);
                        Field targetField = mcpClass.getDeclaredField(Mappings.getFieldName(clazz.getAnnotation(WrappedClass.class).value(), setterAnnotation.value()));
                        targetField.setAccessible(true);

                        fieldMethods.put(meths, targetField);
                    }
                    else
                    {
                        Method targetMethod = mcpClass.getDeclaredMethod(Mappings.getMethodName(clazz.getAnnotation(WrappedClass.class).value(), meths.getName()), meths.getParameterTypes());
                        targetMethod.setAccessible(true);

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

        if(clazz.getInterfaces().length != 0)
        {
            addMethodsViaClassTree(clazz.getInterfaces()[0]);
        }
    }
}
