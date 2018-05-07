package de.ropemc.api.wrapper.net.minecraft.client;

import de.ropemc.Mappings;
import de.ropemc.api.exceptions.MissingAnnotationException;
import de.ropemc.api.wrapper.net.minecraft.client.entity.EntityPlayerSP;
import de.ropemc.api.wrapper.net.minecraft.client.gui.FontRenderer;
import de.ropemc.api.wrapper.net.minecraft.client.gui.GuiIngame;
import de.ropemc.api.wrapper.net.minecraft.client.multiplayer.WorldClient;
import de.ropemc.api.wrapper.WrapperSystem;
import de.ropemc.api.wrapper.net.minecraft.client.settings.GameSettings;
import de.ropemc.api.wrapper.net.minecraft.util.Session;

import java.lang.reflect.Field;

public class Minecraft
{

    public static final String CLASSNAME = "net.minecraft.client.Minecraft";

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
    private static WrapperSystem wrapperSystemGameSettings;

    static
    {
        try
        {
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
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        try
        {
            wrapperSystemEntityPlayerSP = new WrapperSystem(EntityPlayerSP.class);
            wrapperSystemFontRenderer = new WrapperSystem(FontRenderer.class);
            wrapperSystemSession = new WrapperSystem(Session.class);
            wrapperSystemGameSettings = new WrapperSystem(GameSettings.class);
        }
        catch (MissingAnnotationException e)
        {
            e.printStackTrace();
        }
    }

    private static Minecraft theMinecraft = null;

    public static Minecraft getTheMinecraft()
    {
        if (theMinecraft == null)
        {
            try
            {
                Object handle = theMinecraftField.get(null);
                if (handle != null)
                    theMinecraft = new Minecraft(handle);
            }
            catch (IllegalAccessException e)
            {
                e.printStackTrace();
            }
        }
        return theMinecraft;
    }

    private Object handle;
    private EntityPlayerSP thePlayer;
    private FontRenderer fontRenderer;
    private Session session;
    private GameSettings gameSettings;

    public Object getHandle()
    {
        return handle;
    }

    public Minecraft(Object handle)
    {
        this.handle = handle;
    }

    public EntityPlayerSP getThePlayer()
    {
        if (thePlayer == null)
        {
            try
            {
                Object handle = thePlayerField.get(getHandle());
                if (handle != null)
                {
                    thePlayer = (EntityPlayerSP) wrapperSystemEntityPlayerSP.createInstance(handle);
                }
            }
            catch (IllegalAccessException e)
            {
                e.printStackTrace();
            }
        }
        return thePlayer;
    }

    public WorldClient getTheWorld()
    {
        try
        {
            return new WorldClient(theWorldField.get(getHandle()));
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        return null;
    }

    public FontRenderer getFontRenderer()
    {
        if (fontRenderer == null)
        {
            try
            {
                Object handle = fontRendererField.get(getHandle());
                if (handle != null)
                    fontRenderer = (FontRenderer) wrapperSystemFontRenderer.createInstance(handle);
            }
            catch (IllegalAccessException e)
            {
                e.printStackTrace();
            }
        }
        return fontRenderer;
    }

    public Session getSession()
    {
        if(session == null)
        {
            try
            {
                Object handle = sessionField.get(getHandle());
                if(handle != null)
                    session = (Session) wrapperSystemSession.createInstance(handle);
            }
            catch (IllegalAccessException e)
            {
                e.printStackTrace();
            }
        }

        return session;
    }

    public GameSettings getGameSettings()
    {
        if(gameSettings == null)
        {
            try
            {
                Object handle = gameSettingsField.get(getHandle());
                if(handle != null)
                    gameSettings = (GameSettings) wrapperSystemGameSettings.createInstance(handle);
            }
            catch (IllegalAccessException e)
            {
                e.printStackTrace();
            }
        }

        return gameSettings;
    }

    public String getLaunchedVersion()
    {
        try
        {
            return launchedVersionField.get(getHandle()).toString();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public GuiIngame getIngameGUI()
    {
        try
        {
            return new GuiIngame(ingameGuiField.get(getHandle()));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }


}
