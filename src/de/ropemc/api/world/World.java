package de.ropemc.api.world;

import de.ropemc.Mappings;
import de.ropemc.api.Minecraft;
import de.ropemc.utils.Vector3i;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class World {

    private static Class<?> blockPos;

    private static Field theWorld;

    private static Method getBlockState;

    static {
        try {
            Class minecraft = Class.forName(Mappings.getClassName("net.minecraft.client.Minecraft"));

            blockPos = Class.forName(Mappings.getClassName("net.minecraft.util.BlockPos"));

            theWorld = minecraft.getDeclaredField(Mappings.getFieldName("net.minecraft.client.Minecraft","theWorld"));
            theWorld.setAccessible(true);

            getBlockState = getWorld().getClass().getDeclaredMethod(Mappings.getMethodName("net.minecraft.world.World", "getBlockState"), blockPos);
            getBlockState.setAccessible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @return block at a specific position
     */
    public static Block getBlock(Vector3i pos) {
        try {
            Object bPos = blockPos.getDeclaredConstructor(int.class, int.class, int.class).newInstance(pos.x, pos.y, pos.z);
            Object blockState = getBlockState.invoke(getWorld(), bPos);
            Method blockGetter = blockState.getClass().getDeclaredMethod(Mappings.getMethodName("net.minecraft.block.state.IBlockState", "getBlock"));
            blockGetter.setAccessible(true);

            Object block = blockGetter.invoke(blockState);
            Class<?> blockClass = block.getClass();

            int x = blockClass.getDeclaredField(Mappings.getFieldName("net.minecraft.block.Block", "minX")).getInt(block);
            int y = blockClass.getDeclaredField(Mappings.getFieldName("net.minecraft.block.Block", "minY")).getInt(block);
            int z = blockClass.getDeclaredField(Mappings.getFieldName("net.minecraft.block.Block", "minZ")).getInt(block);

            return new Block(new Vector3i(x, y, z));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     *
     * @return instance of the world object
     */
    private static Object getWorld() {
        try {
            return theWorld.get(Minecraft.getMinecraft());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
