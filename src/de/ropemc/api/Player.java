package de.ropemc.api;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import de.ropemc.Mappings;
import de.ropemc.utils.Vector3d;

public class Player {

	private static Object player;

	private static Class minecraft;
	private static Field thePlayer;
	private static Field hurtTime;

	private static Field motionX;
	private static Field motionY;
	private static Field motionZ;

	private static Method isSprinting;
	private static Method setSprinting;
	private static Method isSneaking;
	private static Method setSneaking;
	private static Method isInvisible;

	static {
		try {
			minecraft = Class.forName(Mappings.getClassName("net.minecraft.client.Minecraft"));
			thePlayer = minecraft.getDeclaredField(Mappings.getFieldName("net.minecraft.client.Minecraft","thePlayer"));
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

	/**
	 *
	 * @return instance of the own player
	 */
	public static Object getPlayer()
	{
		try {
			Class.forName("de.ropemc.api.world.World");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			return thePlayer.get(Minecraft.getMinecraft());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	/**
	 *
	 * @return hurttime of the own player
	 */
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

	/**
	 *
	 * @return motion of the own player as a three dimensional double-vector
	 */
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

	/**
	 * sets the motion of the own player
	 * @param motion three dimensional double-vector which represents the motion
	 */
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

	/**
	 *
	 * @return if the own player is sprinting
	 */
	public static boolean isSprinting() {
		try {
			return (boolean) isSprinting.invoke(player);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * sets the own player's sprinting state
	 * @param flag sprinting state
	 */
	public static void setSprinting(boolean flag) {
		try {
			setSprinting.invoke(player, flag);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 *
	 * @return if the own player is sneaking
	 */
	public static boolean isSneaking() {
		try {
			return (boolean) isSneaking.invoke(player);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * sets the own player's sneaking state
	 * @param flag sneaking state
	 */
	public static void setSneaking(boolean flag) {
		try {
			setSneaking.invoke(player, flag);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 *
	 * @return if the own player is invisible
	 */
	public static boolean isInvisible() {
		try {
			return (boolean) isInvisible.invoke(player);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
