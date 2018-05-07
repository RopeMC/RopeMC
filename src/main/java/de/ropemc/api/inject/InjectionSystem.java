package de.ropemc.api.inject;

import de.ropemc.Mappings;
import de.ropemc.api.exceptions.MissingAnnotationException;
import de.ropemc.api.wrapper.WrappedClass;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class InjectionSystem
{
    private Map<Method, Method> methods = new HashMap<>();
    private Class callClazzMcp;
    private Class<?> calledFromClass;

    public InjectionSystem(Class<?> injectionClass) throws MissingAnnotationException
    {
        calledFromClass = injectionClass;

        if(calledFromClass.isAnnotationPresent(InjectIntoClass.class))
        {
            InjectIntoClass iic = calledFromClass.getAnnotation(InjectIntoClass.class);

            try
            {
                String mcClassName = calledFromClass.getAnnotation(InjectIntoClass.class).wrapperClass().getAnnotation(WrappedClass.class).value();
                callClazzMcp = Class.forName(Mappings.getClassName(mcClassName));

                for(Method meths : calledFromClass.getDeclaredMethods())
                {
                    if(meths.getReturnType() == AfterInjectAction.class)
                    {
                        Method targetMethod = callClazzMcp.getDeclaredMethod(Mappings.getMethodName(mcClassName, meths.getName()),meths.getParameterTypes());
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
            throw new MissingAnnotationException("Missing Annotation: " + InjectIntoClass.class.getName() + " in Class: " + calledFromClass.getName());
        }
    }

    /**
     * Creates a proxied Instance
     *
     * @param handle the Handle of the instance
     * @return I actually dont know
     */
    public Object getProxiedInstance(Object handle)
    {
        return Proxy.newProxyInstance(calledFromClass.getClassLoader(), new Class[]{calledFromClass}, (proxy, method, args) ->
        {
            Method interfaceBaseMethod = calledFromClass.getMethod(method.getName(), method.getParameterTypes());
            AfterInjectAction returnValue = (AfterInjectAction) interfaceBaseMethod.invoke(null, args);

            if(returnValue == AfterInjectAction.CONTINUE)
            {
                methods.get(method).invoke(handle, args);
            }

            return null;
        });
    }
}
