package de.ropemc.api;

import java.lang.reflect.Method;

public class Keyboard {

    private static Class c1 = null;
    private static Method m1 = null;

    static {
        try
        {
            c1 = Class.forName("org.lwjgl.input.Keyboard");
            m1 = c1.getDeclaredMethod("isKeyDown",int.class);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static boolean isKeyDown(int key)
    {
        try {
            return (boolean)m1.invoke(null,key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public enum Keys {
        A(30,"A"),
        B(48,"B"),
        C(46,"C"),
        D(32,"D"),
        E(18,"E"),
        F(33,"F"),
        G(34,"G"),
        K(37,"K"),
        R(19,"R");
        private int id;
        private String name;
        Keys(int id,String name)
        {
            this.id=id;
            this.name=name;
        }
        public int getId()
        {
            return id;
        }
        public String getName()
        {
            return name;
        }
    }

}
