package de.ropemc.api.wrapper;


import de.ropemc.Mappings;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class WrapperSystem
{
    private Map<Method, Method> methods = new HashMap<>();
    private Class callClazzMcp;
    private Class calledFromClass;

    public WrapperSystem(Class<?> clazz)
    {
        this.calledFromClass = clazz;

        if(clazz.isAnnotationPresent(WrapperClass.class))
        {
            try
            {
                callClazzMcp = Class.forName(Mappings.getClassName(clazz.getAnnotation(WrapperClass.class).value()));
            }
            catch (ClassNotFoundException e)
            {
                e.printStackTrace();
            }
            for(Method meths : clazz.getDeclaredMethods())
            {
                try
                {
                    Method targetMethod = callClazzMcp.getDeclaredMethod(Mappings.getMethodName(clazz.getAnnotation(WrapperClass.class).value(), meths.getName()),meths.getParameterTypes());
                    targetMethod.setAccessible(true);

                    methods.put(meths, targetMethod);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
    }

    public Object createInstance(Object handle)
    {
        return Proxy.newProxyInstance(calledFromClass.getClassLoader(), new Class[]{calledFromClass}, (proxy, method, args) ->
        {
            Method targetMethod = methods.get(method);

            return targetMethod.invoke(handle, args);
        });
    }
}
