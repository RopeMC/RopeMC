package de.ropemc.api;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import de.ropemc.Mappings;
import de.ropemc.utils.Vector3d;

public class Player {

	public static Object player;

	public static Class Minecraft;
	public static Field thePlayer;
	public static Field hurtTime;

	public static Field motionX;
	public static Field motionY;
	public static Field motionZ;

	public static Method isSprinting;
	public static Method setSprinting;
	public static Method isSneaking;
	public static Method setSneaking;
	public static Method isInvisible;

	static {
		try {
			Minecraft = Class.forName(Mappings.getClassName("net.minecraft.client.Minecraft"));
			thePlayer = Minecraft.getDeclaredField(Mappings.getFieldName("net.minecraft.client.Minecraft","thePlayer"));
			thePlayer.setAccessible(true);

			hurtTime = Class.forName(Mappings.getClassName("net.minecraft.entity.EntityLivingBase")).getDeclaredField(Mappings.getFieldName("net.minecraft.entity.EntityLivingBase", "hurtTime"));
			hurtTime.setAccessible(true);

			motionX = Class.forName(Mappings.getClassName("net.minecraft.entity.Entity")).getDeclaredField(Mappings.getFieldName("net.minecraft.entity.Entity", "motionX"));
			motionY = Class.forName(Mappings.getClassName("net.minecraft.entity.Entity")).getDeclaredField(Mappings.getFieldName("net.minecraft.entity.Entity", "motionY"));
			motionZ = Class.forName(Mappings.getClassName("net.minecraft.entity.Entity")).getDeclaredField(Mappings.getFieldName("net.minecraft.entity.Entity", "motionZ"));
			motionX.setAccessible(true);
			motionY.setAccessible(true);
			motionZ.setAccessible(true);

			isSprinting = Class.forName(Mappings.getClassName("net.minecraft.entity.Entity")).getMethod(Mappings.getMethodName("net.minecraft.entity.Entity", "isSprinting"));
			setSprinting = Class.forName(Mappings.getClassName("net.minecraft.entity.Entity")).getMethod(Mappings.getMethodName("net.minecraft.entity.Entity", "setSprinting"));
			isSneaking = Class.forName(Mappings.getClassName("net.minecraft.entity.Entity")).getMethod(Mappings.getMethodName("net.minecraft.entity.Entity", "isSneaking"));
			setSneaking = Class.forName(Mappings.getClassName("net.minecraft.entity.Entity")).getMethod(Mappings.getMethodName("net.minecraft.entity.Entity", "setSneaking"));
			isInvisible = Class.forName(Mappings.getClassName("net.minecraft.entity.Entity")).getMethod(Mappings.getMethodName("net.minecraft.entity.Entity", "isInvisible"));
			isSprinting.setAccessible(true);
			setSprinting.setAccessible(true);
			isSneaking.setAccessible(true);
			setSneaking.setAccessible(true);
			isInvisible.setAccessible(true);

			player = getPlayer();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Object getPlayer()
	{
		try {
			if(Minecraft==null)
			{
				return null;
			}
			return thePlayer.get(de.ropemc.api.Minecraft.getMinecraft());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;

	}
	
	public static int getHurtTime()
	{
		try {
			return hurtTime.getInt(player);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public static Vector3d getMotion()
	{
		try {
			Vector3d motion = new Vector3d(motionX.getDouble(player),motionY.getDouble(player),motionZ.getDouble(player));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return new Vector3d(0.0,0.0,0.0);
	}
	
	public static void setMotion(Vector3d motion)
	{
		try {
			motionX.set(player, motion.getX());
			motionY.set(player, motion.getY());
			motionZ.set(player, motion.getZ());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean isSprinting() {
		try {
			return (boolean) isSprinting.invoke(player);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public static void setSprinting(boolean flag) {
		try {
			setSprinting.invoke(player, flag);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean isSneaking() {
		try {
			return (boolean) isSneaking.invoke(player);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public static void setSneaking(boolean flag) {
		try {
			setSneaking.invoke(player, flag);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean isInvisible() {
		try {
			return (boolean) isInvisible.invoke(player);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
