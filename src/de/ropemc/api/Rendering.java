package de.ropemc.api;

import de.ropemc.Mappings;

import java.lang.reflect.Method;

public class Rendering {

    public static int drawString(String text, int x, int y, int color) {
        try {
            Method m = Class.forName(Mappings.getClassName("net.minecraft.client.gui.FontRenderer")).getMethod(Mappings.getMethodName(Mappings.getClassName("net.minecraft.client.gui.FontRenderer"), "drawString"));
            m.setAccessible(true);
            return (int) m.invoke(getFontRenderer(), text, x, y, color);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static int drawStringWithShadow(String text, int x, int y, int color) {
        try {
            Method m = Class.forName(Mappings.getClassName("net.minecraft.client.gui.FontRenderer")).getMethod(Mappings.getMethodName(Mappings.getClassName("net.minecraft.client.gui.FontRenderer"), "drawStringWithShadow"));
            m.setAccessible(true);
            return (int) m.invoke(getFontRenderer(), text, x, y, color);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static int drawCenteredString(String text, int x, int y, int color) {
        try {
            Method m = Class.forName(Mappings.getClassName("net.minecraft.client.gui.FontRenderer")).getMethod(Mappings.getMethodName(Mappings.getClassName("net.minecraft.client.gui.FontRenderer"), "drawCenteredString"));
            m.setAccessible(true);
            return (int) m.invoke(getFontRenderer(), text, x, y, color);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    private static Object getFontRenderer() {
        try {
            Method m = Class.forName(Mappings.getClassName("net.minecraft.client.gui.GuiIngame")).getMethod(Mappings.getMethodName(Mappings.getClassName("net.minecraft.client.gui.GuiIngame"), "getFontRenderer"));
            m.setAccessible(true);
            return m.invoke(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}