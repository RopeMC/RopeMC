package de.ropemc.api.wrapper.net.minecraft.client.entity;

import de.ropemc.Mappings;
import de.ropemc.api.wrapper.net.minecraft.client.Minecraft;
import de.ropemc.api.wrapper.net.minecraft.util.ChatComponentText;
import de.ropemc.utils.Vector3d;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class EntityPlayerSP {

    private static Class minecraft;
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

    private static EntityPlayerSP thePlayerObject = null;

    static
    {
        try
        {
            minecraft = Class.forName(Mappings.getClassName("net.minecraft.client.Minecraft"));
            hurtTime = Class.forName(Mappings.getClassName("net.minecraft.entity.EntityLivingBase")).getDeclaredField(Mappings.getFieldName("net.minecraft.entity.EntityLivingBase", "hurtTime"));
            hurtTime.setAccessible(true);
            Class<?> entityClass = Class.forName(Mappings.getClassName("net.minecraft.entity.Entity"));
            posX = entityClass.getDeclaredField(Mappings.getFieldName("net.minecraft.entity.Entity", "posX"));
            posY = entityClass.getDeclaredField(Mappings.getFieldName("net.minecraft.entity.Entity", "posY"));
            posZ = entityClass.getDeclaredField(Mappings.getFieldName("net.minecraft.entity.Entity", "posZ"));
            posX.setAccessible(true);
            posY.setAccessible(true);
            posZ.setAccessible(true);
            motionX = entityClass.getDeclaredField(Mappings.getFieldName("net.minecraft.entity.Entity", "motionX"));
            motionY = entityClass.getDeclaredField(Mappings.getFieldName("net.minecraft.entity.Entity", "motionY"));
            motionZ = entityClass.getDeclaredField(Mappings.getFieldName("net.minecraft.entity.Entity", "motionZ"));
            motionX.setAccessible(true);
            motionY.setAccessible(true);
            motionZ.setAccessible(true);
            isSprinting = entityClass.getMethod(Mappings.getMethodName("net.minecraft.entity.Entity", "isSprinting"));
            setSprinting = entityClass.getMethod(Mappings.getMethodName("net.minecraft.entity.Entity", "setSprinting"));
            isSneaking = entityClass.getMethod(Mappings.getMethodName("net.minecraft.entity.Entity", "isSneaking"));
            setSneaking = entityClass.getMethod(Mappings.getMethodName("net.minecraft.entity.Entity", "setSneaking"));
            isInvisible = entityClass.getMethod(Mappings.getMethodName("net.minecraft.entity.Entity", "isInvisible"));
            isSprinting.setAccessible(true);
            setSprinting.setAccessible(true);
            isSneaking.setAccessible(true);
            setSneaking.setAccessible(true);
            isInvisible.setAccessible(true);
            Class entityPlayerClass = Class.forName(Mappings.getClassName("net.minecraft.entity.player.EntityPlayer"));
            getNameMethod = entityPlayerClass.getMethod(Mappings.getMethodName("net.minecraft.entity.player.EntityPlayer","getName"));
            getNameMethod.setAccessible(true);
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

    /**
     *
     * @return hurttime of the own player
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
     * @return motion of the own player as a three dimensional double-vector
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
     * @return position of the own player as a three dimensional double-vector
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
     * sets the motion of the own player
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
     * @return if the own player is sprinting
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
     * sets the own player's sprinting state
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
     * @return if the own player is sneaking
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
     * sets the own player's sneaking state
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
     * @return if the own player is invisible
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
