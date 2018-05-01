package de.ropemc.utils.wrapper;


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
                if(clazz.isAnnotationPresent(RootClass.class))
                {
                    callClazzMcp = Class.forName(Mappings.getClassName(clazz.getAnnotation(RootClass.class).value()));
                }
            }
            catch (ClassNotFoundException e)
            {
                e.printStackTrace();
            }
            for(Method meths : clazz.getDeclaredMethods())
            {
                try
                {
                    Method targetMethod = callClazzMcp.getDeclaredMethod(Mappings.getMethodName(clazz.getAnnotation(RootClass.class).value(), meths.getName()),meths.getParameterTypes());
                    targetMethod.setAccessible(true);
                    if(targetMethod != null)
                    {
                        methods.put(meths, targetMethod);
                    }
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
            targetMethod.setAccessible(true);

            return targetMethod.invoke(handle, args);
        });
    }
}
