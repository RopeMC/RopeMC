package de.ropemc.api.wrapper.net.minecraft.client.entity;

import de.ropemc.Mappings;
import de.ropemc.api.wrapper.net.minecraft.client.Minecraft;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.util.ChatComponentText;
import de.ropemc.utils.Vector3d;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.UUID;

public class EntityPlayerSP {

    public static final String CLASSNAME = "net.minecraft.client.entity.EntityPlayerSP";

    private static Field hurtTime;

    private static Field posX;
    private static Field posY;
    private static Field posZ;

    private static Field motionX;
    private static Field motionY;
    private static Field motionZ;

    private static Method isSprinting;
    private static Method setSprinting;
    private static Method isSneaking;
    private static Method setSneaking;
    private static Method isInvisible;

    private static Method getNameMethod;
    private static Method swingItemMethod;
    private static Method respawnPlayerMethod;
    private static Method sendChatMessageMethod;

    private static EntityPlayerSP thePlayerObject = null;

    static
    {
        try
        {
            hurtTime = Class.forName(Mappings.getClassName("net.minecraft.entity.EntityLivingBase")).getDeclaredField(Mappings.getFieldName("net.minecraft.entity.EntityLivingBase", "hurtTime"));
            hurtTime.setAccessible(true);
            Class<?> entityClass = Class.forName(Mappings.getClassName(Entity.CLASSNAME));
            posX = entityClass.getDeclaredField(Mappings.getFieldName(Entity.CLASSNAME, "posX"));
            posY = entityClass.getDeclaredField(Mappings.getFieldName(Entity.CLASSNAME, "posY"));
            posZ = entityClass.getDeclaredField(Mappings.getFieldName(Entity.CLASSNAME, "posZ"));
            posX.setAccessible(true);
            posY.setAccessible(true);
            posZ.setAccessible(true);
            motionX = entityClass.getDeclaredField(Mappings.getFieldName(Entity.CLASSNAME, "motionX"));
            motionY = entityClass.getDeclaredField(Mappings.getFieldName(Entity.CLASSNAME, "motionY"));
            motionZ = entityClass.getDeclaredField(Mappings.getFieldName(Entity.CLASSNAME, "motionZ"));
            motionX.setAccessible(true);
            motionY.setAccessible(true);
            motionZ.setAccessible(true);
            isSprinting = entityClass.getMethod(Mappings.getMethodName(Entity.CLASSNAME, "isSprinting"));
            setSprinting = entityClass.getMethod(Mappings.getMethodName(Entity.CLASSNAME, "setSprinting"));
            isSneaking = entityClass.getMethod(Mappings.getMethodName(Entity.CLASSNAME, "isSneaking"));
            setSneaking = entityClass.getMethod(Mappings.getMethodName(Entity.CLASSNAME, "setSneaking"));
            isInvisible = entityClass.getMethod(Mappings.getMethodName(Entity.CLASSNAME, "isInvisible"));
            isSprinting.setAccessible(true);
            setSprinting.setAccessible(true);
            isSneaking.setAccessible(true);
            setSneaking.setAccessible(true);
            isInvisible.setAccessible(true);
            Class entityPlayerClass = Class.forName(Mappings.getClassName(EntityPlayer.CLASSNAME));
            getNameMethod = entityPlayerClass.getDeclaredMethod(Mappings.getMethodName(EntityPlayer.CLASSNAME,"getName"));
            getNameMethod.setAccessible(true);
            Class entityPlayerSPClass = Class.forName(Mappings.getClassName(CLASSNAME));
            swingItemMethod = entityPlayerSPClass.getDeclaredMethod(Mappings.getMethodName(CLASSNAME,"swingItem"));
            swingItemMethod.setAccessible(true);
            respawnPlayerMethod = entityPlayerSPClass.getDeclaredMethod(Mappings.getMethodName(CLASSNAME,"respawnPlayer"));
            respawnPlayerMethod.setAccessible(true);
            sendChatMessageMethod = entityPlayerSPClass.getDeclaredMethod(Mappings.getMethodName(CLASSNAME,"sendChatMessage"),String.class);
            sendChatMessageMethod.setAccessible(true);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private Object handle;

    public EntityPlayerSP(Object handle)
    {
        this.handle=handle;
    }

    public Object getHandle()
    {
        return handle;
    }

    public String getName()
    {
        try
        {
            return (String)getNameMethod.invoke(getHandle());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public void swingItem()
    {
        try
        {
            swingItemMethod.invoke(getHandle());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void respawnPlayer()
    {
        try
        {
            respawnPlayerMethod.invoke(getHandle());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void sendChatMessage(String message)
    {
        try
        {
            sendChatMessageMethod.invoke(getHandle(),message);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Deprecated
    public UUID getUUID()
    {
        try
        {
            //return (String)getUUIDMethod.invoke(getHandle());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    /**
     *
     * @return hurttime of the own chat
     */
    public int getHurtTime()
    {
        try
        {
            return hurtTime.getInt(getHandle());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     *
     * @return motion of the own chat as a three dimensional double-vector
     */
    public Vector3d getMotion()
    {
        try
        {
            return new Vector3d(motionX.getDouble(getHandle()),motionY.getDouble(getHandle()),motionZ.getDouble(getHandle()));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return new Vector3d(0.0,0.0,0.0);
    }

    /**
     *
     * @return position of the own chat as a three dimensional double-vector
     */
    public Vector3d getPosition()
    {
        try
        {
            return new Vector3d(posX.getDouble(getHandle()), posY.getDouble(getHandle()), posZ.getDouble(getHandle()));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return new Vector3d(0.0, 0.0, 0.0);
    }

    /**
     * sets the motion of the own chat
     * @param motion three dimensional double-vector which represents the motion
     */
    public void setMotion(Vector3d motion)
    {
        try
        {
            motionX.set(getHandle(), motion.getX());
            motionY.set(getHandle(), motion.getY());
            motionZ.set(getHandle(), motion.getZ());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     *
     * @return if the own chat is sprinting
     */
    public boolean isSprinting()
    {
        try
        {
            return (boolean) isSprinting.invoke(getHandle());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * sets the own chat's sprinting state
     * @param flag sprinting state
     */
    public void setSprinting(boolean flag)
    {
        try
        {
            setSprinting.invoke(getHandle(), flag);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     *
     * @return if the own chat is sneaking
     */
    public boolean isSneaking()
    {
        try
        {
            return (boolean) isSneaking.invoke(getHandle());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * sets the own chat's sneaking state
     * @param flag sneaking state
     */
    public void setSneaking(boolean flag)
    {
        try
        {
            setSneaking.invoke(getHandle(), flag);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     *
     * @return if the own chat is invisible
     */
    public boolean isInvisible()
    {
        try
        {
            return (boolean) isInvisible.invoke(getHandle());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    public void printChatMessage(String message)
    {
        Minecraft.getTheMinecraft().getIngameGUI().getChatGUI().printChatMessage(new ChatComponentText(message));
    }

}
