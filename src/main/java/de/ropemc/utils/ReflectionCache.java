package de.ropemc.utils;

import de.ropemc.Mappings;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class ReflectionCache {

    private static Map<String,Class> classes = new HashMap<>();
    private static Map<String,Field> fields = new HashMap<>();
    private static Map<String,Method> methods = new HashMap<>();

    public static Class getClass(String className,boolean useMappings){
        if(!classes.containsKey(className)) {
            String name = useMappings ? Mappings.getClassName(className) : className;
            try {
                classes.put(className, Class.forName(name));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return classes.get(className);
    }

    public static Field getField(String className,String fieldName,boolean useMappings){
        String saveName = className+"@"+fieldName;
        if(!fields.containsKey(saveName)) {
            Class clazz = getClass(className,useMappings);
            String name = useMappings ? Mappings.getFieldName(className,fieldName) : fieldName;
            try {
                Field f = clazz.getDeclaredField(name);
                f.setAccessible(true);
                fields.put(saveName, f);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
        }
        return fields.get(saveName);
    }

    public static Method getMethod(String className,String methodName,boolean useMappings,Class... parameterTypes){
        String saveName = className+"@"+methodName;
        if(!methods.containsKey(saveName)){
            Class clazz = getClass(className,useMappings);
            String name = useMappings ? Mappings.getMethodName(className,methodName) : methodName;
            try {
                Method m = clazz.getDeclaredMethod(name,parameterTypes);
                m.setAccessible(true);
                methods.put(saveName, m);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
        return methods.get(saveName);
    }

}
