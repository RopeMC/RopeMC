package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.Mappings;

import java.lang.reflect.Constructor;

public class ChatComponentText {

    private static Class thisClass;
    private static Constructor stringConstructor;

    static {
        try {
            thisClass = Class.forName(Mappings.getClassName("net.minecraft.util.ChatComponentText"));
            stringConstructor = thisClass.getDeclaredConstructor(String.class);
            stringConstructor.setAccessible(true);
        }catch(Exception ex){ex.printStackTrace();}
    }

    private Object handle;

    public Object getHandle() {
        return handle;
    }

    public ChatComponentText(Object handle)
    {
        this.handle=handle;
    }

    public ChatComponentText(String text)
    {
        try {
            this.handle = stringConstructor.newInstance(text);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

}
