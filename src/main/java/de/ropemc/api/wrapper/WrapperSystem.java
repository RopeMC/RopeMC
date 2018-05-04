package de.ropemc.api.wrapper;


import de.ropemc.Mappings;
import de.ropemc.api.exceptions.MissingAnnotationException;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class WrapperSystem
{
    private Map<Method, Method> methods = new HashMap<>();
    private Class callClazzMcp;
    private Class<?> calledFromClass;

    public WrapperSystem(Class<?> clazz) throws MissingAnnotationException
    {
        this.calledFromClass = clazz;

        if(calledFromClass.isAnnotationPresent(WrappedClass.class))
        {
            try
            {
                callClazzMcp = Class.forName(Mappings.getClassName(calledFromClass.getAnnotation(WrappedClass.class).value()));
            }
            catch (ClassNotFoundException e)
            {
                e.printStackTrace();
            }

            addMethodsViaClassTree(calledFromClass);
        }
        else
        {
            throw new MissingAnnotationException("Missing Annotation: " + WrappedClass.class.getName() + " in Class: " + calledFromClass.getName());
        }
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
            System.out.println(method.getName());
//            Method targetMethod = methods.get(method);
//
//            return targetMethod.invoke(handle, args);

            return null;
        });
    }

    private void addMethodsViaClassTree(Class<?> clazz)
    {
        for(Method meths : clazz.getDeclaredMethods())
        {
            try
            {
                Method targetMethod = clazz.getDeclaredMethod(Mappings.getMethodName(clazz.getAnnotation(WrappedClass.class).value(), meths.getName()),meths.getParameterTypes());
                targetMethod.setAccessible(true);

                methods.put(meths, targetMethod);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

        if(clazz.getSuperclass() != null)
        {
            addMethodsViaClassTree(clazz.getSuperclass());
        }
    }
}
