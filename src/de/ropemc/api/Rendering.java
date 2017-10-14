package de.ropemc.api;

import de.ropemc.Mappings;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Rendering {

    private static Object fontRenderer;
    private static Class<?> fontRendererClass;

    private static Method drawString;
    private static Method drawStringWithShadow;
    private static Method drawCenteredString;

    static {
        try {
            Field f = Class.forName(Mappings.getClassName("net.minecraft.client.Minecraft")).getField(Mappings.getFieldName(Mappings.getClassName("net.minecraft.client.Minecraft"), "fontRendererObj"));
            f.setAccessible(true);
            fontRenderer = f.get(Minecraft.getMinecraft());
            fontRendererClass = fontRenderer.getClass();

            drawString = fontRendererClass.getDeclaredMethod(Mappings.getMethodName(Mappings.getClassName("net.minecraft.client.gui.FontRenderer"), "drawString"), String.class, float.class, float.class, int.class);
            drawString.setAccessible(true);

            drawStringWithShadow = fontRendererClass.getDeclaredMethod(Mappings.getMethodName(Mappings.getClassName("net.minecraft.client.gui.FontRenderer"), "drawStringWithShadow"), String.class, float.class, float.class, int.class);
            drawStringWithShadow.setAccessible(true);

            drawCenteredString = fontRendererClass.getDeclaredMethod(Mappings.getMethodName(Mappings.getClassName("net.minecraft.client.gui.FontRenderer"), "drawCenteredString"), String.class, float.class, float.class, int.class);
            drawCenteredString.setAccessible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void drawString(String text, float x, float y, int color) {
        try {
            drawString.invoke(fontRenderer, text, x, y, color);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void drawStringWithShadow(String text, float x, float y, int color) {
        try {
            drawStringWithShadow.invoke(fontRenderer, text, x, y, color);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void drawCenteredString(String text, float x, float y, int color) {
        try {
            drawCenteredString.invoke(fontRenderer, text, x, y, color);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}