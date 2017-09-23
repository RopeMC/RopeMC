package de.ropemc.api;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import de.ropemc.Mappings;
import de.ropemc.utils.HelperClasses.Vector3d;
import de.ropemc.utils.Mapping;

public class Player {
	
	private static Object getPlayer()
	{
		try {
			Class mc = Class.forName(Mappings.getClassName("net.minecraft.client.Minecraft"));
			if(mc==null)
			{
				return null;
			}
			Field f = mc.getDeclaredField(Mappings.getFieldName("net.minecraft.client.Minecraft","thePlayer"));
			f.setAccessible(true);
			return f.get(Minecraft.getMinecraft());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;

	}
	
	public static int getHurtTime()
	{
		try {
			Object player = getPlayer();
			Field f = Class.forName(Mappings.getClassName("net.minecraft.entity.EntityLivingBase")).getDeclaredField(Mappings.getFieldName("net.minecraft.entity.EntityLivingBase", "hurtTime"));
			f.setAccessible(true);
			return f.getInt(player);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public static Vector3d getMotion()
	{
		try {
			Object player = getPlayer();
			Field fx = Class.forName(Mappings.getClassName("net.minecraft.entity.Entity")).getDeclaredField(Mappings.getFieldName("net.minecraft.entity.Entity", "motionX"));
			fx.setAccessible(true);
			Field fy = Class.forName(Mappings.getClassName("net.minecraft.entity.Entity")).getDeclaredField(Mappings.getFieldName("net.minecraft.entity.Entity", "motionY"));
			fy.setAccessible(true);
			Field fz = Class.forName(Mappings.getClassName("net.minecraft.entity.Entity")).getDeclaredField(Mappings.getFieldName("net.minecraft.entity.Entity", "motionZ"));
			fz.setAccessible(true);
			Vector3d motion = new Vector3d(fx.getDouble(player),fy.getDouble(player),fz.getDouble(player));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return new Vector3d(0.0,0.0,0.0);
	}
	
	public static void setMotion(Vector3d motion)
	{
		try {
			Object player = getPlayer();
			Field fx = Class.forName(Mappings.getClassName("net.minecraft.entity.Entity")).getDeclaredField(Mappings.getFieldName("net.minecraft.entity.Entity", "motionX"));
			fx.setAccessible(true);
			fx.set(player, motion.getX());
			Field fy = Class.forName(Mappings.getClassName("net.minecraft.entity.Entity")).getDeclaredField(Mappings.getFieldName("net.minecraft.entity.Entity", "motionY"));
			fy.setAccessible(true);
			fy.set(player, motion.getY());
			Field fz = Class.forName(Mappings.getClassName("net.minecraft.entity.Entity")).getDeclaredField(Mappings.getFieldName("net.minecraft.entity.Entity", "motionZ"));
			fz.setAccessible(true);
			fz.set(player, motion.getZ());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean isSprinting() {
		try {
			Object player = getPlayer();
			Method m = Class.forName(Mappings.getClassName("net.minecraft.entity.Entity")).getMethod(Mappings.getMethodName("net.minecraft.entity.Entity", "isSprinting"));
			m.setAccessible(true);
			return (boolean) m.invoke(player);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public static void setSprinting(boolean flag) {
		try {
			Object player = getPlayer();
			Method m = Class.forName(Mappings.getClassName("net.minecraft.entity.Entity")).getMethod(Mappings.getMethodName("net.minecraft.entity.Entity", "setSprinting"));
			m.setAccessible(true);
			m.invoke(player, flag);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean isSneaking() {
		try {
			Object player = getPlayer();
			Method m = Class.forName(Mappings.getClassName("net.minecraft.entity.Entity")).getMethod(Mappings.getMethodName("net.minecraft.entity.Entity", "isSneaking"));
			m.setAccessible(true);
			return (boolean) m.invoke(player);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public static void setSneaking(boolean flag) {
		try {
			Object player = getPlayer();
			Method m = Class.forName(Mappings.getClassName("net.minecraft.entity.Entity")).getMethod(Mappings.getMethodName("net.minecraft.entity.Entity", "setSneaking"));
			m.setAccessible(true);
			m.invoke(player, flag);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
