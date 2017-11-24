package de.ropemc.api;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import de.ropemc.Mappings;
import de.ropemc.utils.Vector3d;

public class Player {

	private static Class minecraft;
	private static Field thePlayer;
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

	static {
		try {
			minecraft = Class.forName(Mappings.getClassName("net.minecraft.client.Minecraft"));
			thePlayer = minecraft.getDeclaredField(Mappings.getFieldName("net.minecraft.client.Minecraft","thePlayer"));
			thePlayer.setAccessible(true);

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
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 *
	 * @return instance of the own player
	 */
	private static Object getPlayer()
	{
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
			return hurtTime.getInt(getPlayer());
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
			return new Vector3d(motionX.getDouble(getPlayer()),motionY.getDouble(getPlayer()),motionZ.getDouble(getPlayer()));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return new Vector3d(0.0,0.0,0.0);
	}

	/**
	 *
	 * @return position of the own player as a three dimensional double-vector
	 */
	public static Vector3d getPosition() {
		try {
			return new Vector3d(posX.getDouble(getPlayer()), posY.getDouble(getPlayer()), posZ.getDouble(getPlayer()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Vector3d(0.0, 0.0, 0.0);
	}

	/**
	 * sets the motion of the own player
	 * @param motion three dimensional double-vector which represents the motion
	 */
	public static void setMotion(Vector3d motion)
	{
		try {
			motionX.set(getPlayer(), motion.getX());
			motionY.set(getPlayer(), motion.getY());
			motionZ.set(getPlayer(), motion.getZ());
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
			return (boolean) isSprinting.invoke(getPlayer());
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
			setSprinting.invoke(getPlayer(), flag);
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
			return (boolean) isSneaking.invoke(getPlayer());
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
			setSneaking.invoke(getPlayer(), flag);
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
			return (boolean) isInvisible.invoke(getPlayer());
		} catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
