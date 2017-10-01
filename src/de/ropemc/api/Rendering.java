package de.ropemc.api;

import de.ropemc.Mappings;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Rendering {

    private static Object fontRenderer;

    private static Method drawString;
    private static Method drawStringWithShadow;
    private static Method drawCenteredString;

    static {
        try {
            Field f = Class.forName(Mappings.getClassName("net.minecraft.client.Minecraft")).getField(Mappings.getFieldName(Mappings.getClassName("net.minecraft.client.Minecraft"), "fontRendererObj"));
            f.setAccessible(true);
            fontRenderer = f.get(Minecraft.getMinecraft());

            Method drawStringMethod = Class.forName(Mappings.getClassName("net.minecraft.client.gui.FontRenderer")).getMethod(Mappings.getMethodName(Mappings.getClassName("net.minecraft.client.gui.FontRenderer"), "drawString"));
            drawStringMethod.setAccessible(true);
            drawString = drawStringMethod;

            Method drawStringWithShadowMethod = Class.forName(Mappings.getClassName("net.minecraft.client.gui.FontRenderer")).getMethod(Mappings.getMethodName(Mappings.getClassName("net.minecraft.client.gui.FontRenderer"), "drawStringWithShadow"));
            drawStringWithShadowMethod.setAccessible(true);
            drawStringWithShadow = drawStringWithShadowMethod;

            Method drawCenteredStringMethod = Class.forName(Mappings.getClassName("net.minecraft.client.gui.FontRenderer")).getMethod(Mappings.getMethodName(Mappings.getClassName("net.minecraft.client.gui.FontRenderer"), "drawCenteredString"));
            drawCenteredStringMethod.setAccessible(true);
            drawCenteredString = drawCenteredStringMethod;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int drawString(String text, int x, int y, int color) {
        try {
            return (int) drawString.invoke(fontRenderer, text, x, y, color);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static int drawStringWithShadow(String text, int x, int y, int color) {
        try {
            return (int) drawStringWithShadow.invoke(fontRenderer, text, x, y, color);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static int drawCenteredString(String text, int x, int y, int color) {
        try {
            return (int) drawCenteredString.invoke(fontRenderer, text, x, y, color);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}