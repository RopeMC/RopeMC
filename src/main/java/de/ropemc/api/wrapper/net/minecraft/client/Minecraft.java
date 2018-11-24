package de.ropemc.api.wrapper.net.minecraft.client;

import de.ropemc.Mappings;
import de.ropemc.api.wrapper.net.minecraft.client.entity.EntityPlayerSP;
import de.ropemc.api.wrapper.net.minecraft.client.gui.FontRenderer;
import de.ropemc.api.wrapper.WrapperSystem;
import de.ropemc.api.wrapper.net.minecraft.util.Session;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static de.ropemc.api.wrapper.WrapperSystem.getWrapperSystem;

public class Minecraft {

    private static Field theMinecraftField;
    private static Field launchedVersionField;
    private static Field ingameGuiField;
    private static Field thePlayerField;
    private static Field theWorldField;
    private static Field fontRendererField;
    private static Field sessionField;
    private static Field gameSettingsField;
    private static WrapperSystem wrapperSystemEntityPlayerSP;
    private static WrapperSystem wrapperSystemFontRenderer;
    private static WrapperSystem wrapperSystemSession;

    static {
        try {
            Class<?> mcClass = Class.forName(Mappings.getClassName("net.minecraft.client.Minecraft"));
            theMinecraftField = mcClass.getDeclaredField(Mappings.getFieldName("net.minecraft.client.Minecraft", "theMinecraft"));
            theMinecraftField.setAccessible(true);
            thePlayerField = mcClass.getDeclaredField(Mappings.getFieldName("net.minecraft.client.Minecraft", "thePlayer"));
            thePlayerField.setAccessible(true);
            theWorldField = mcClass.getDeclaredField(Mappings.getFieldName("net.minecraft.client.Minecraft", "theWorld"));
            theWorldField.setAccessible(true);
            launchedVersionField = mcClass.getDeclaredField(Mappings.getFieldName("net.minecraft.client.Minecraft", "launchedVersion"));
            launchedVersionField.setAccessible(true);
            ingameGuiField = mcClass.getDeclaredField(Mappings.getFieldName("net.minecraft.client.Minecraft", "ingameGUI"));
            ingameGuiField.setAccessible(true);
            fontRendererField = mcClass.getDeclaredField(Mappings.getFieldName("net.minecraft.client.Minecraft", "fontRendererObj"));
            fontRendererField.setAccessible(true);
            sessionField = mcClass.getDeclaredField(Mappings.getFieldName("net.minecraft.client.Minecraft", "session"));
            sessionField.setAccessible(true);
            gameSettingsField = mcClass.getDeclaredField(Mappings.getFieldName("net.minecraft.client.Minecraft", "gameSettings"));
            gameSettingsField.setAccessible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }

        wrapperSystemEntityPlayerSP = getWrapperSystem(EntityPlayerSP.class);
        wrapperSystemFontRenderer = getWrapperSystem(FontRenderer.class);
        wrapperSystemSession = getWrapperSystem(Session.class);
    }

    private static Minecraft theMinecraft = null;

    public static Minecraft getTheMinecraft() {
        if (theMinecraft == null) {
            try {
                Object handle = theMinecraftField.get(null);
                if (handle != null)
                    theMinecraft = new Minecraft(handle);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return theMinecraft;
    }

    private Object handle;
    private FontRenderer fontRenderer;
    private Session session;

    public Object getHandle() {
        return handle;
    }

    public Minecraft(Object handle) {
        this.handle = handle;
    }

    public EntityPlayerSP getThePlayer() {
        try {
            Object handle = thePlayerField.get(getHandle());
            if (handle != null) {
                return (EntityPlayerSP) wrapperSystemEntityPlayerSP.createInstance(handle);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public FontRenderer getFontRenderer() {
        if (fontRenderer == null) {
            try {
                Object handle = fontRendererField.get(getHandle());
                if (handle != null)
                    fontRenderer = (FontRenderer) wrapperSystemFontRenderer.createInstance(handle);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return fontRenderer;
    }

    public Session getSession() {
        if (session == null) {
            try {
                Object handle = sessionField.get(getHandle());
                if (handle != null)
                    session = (Session) wrapperSystemSession.createInstance(handle);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        return session;
    }

    public String getLaunchedVersion() {
        try {
            return launchedVersionField.get(getHandle()).toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void setWindowTitle(String title) {
        try {
            Field f1 = Class.forName("org.lwjgl.opengl.Display").getDeclaredField("display_impl");
            f1.setAccessible(true);
            Method m = f1.getType().getDeclaredMethod("setTitle", String.class);
            m.setAccessible(true);
            m.invoke(f1.get(null), title);
            Field f2 = Class.forName("org.lwjgl.opengl.Display").getDeclaredField("title");
            f2.setAccessible(true);
            f2.set(null, title);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}