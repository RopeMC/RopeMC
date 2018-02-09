package de.ropemc.api.world;

import de.ropemc.Mappings;
import de.ropemc.api.DeprecatedMinecraft;
import de.ropemc.utils.Vector3i;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class World
{

    private static Class<?> blockPos;

    private static Field theWorld;

    private static Method getBlockState;

    static
    {
        try
        {
            Class minecraft = Class.forName(Mappings.getClassName("net.minecraft.client.Minecraft"));

            blockPos = Class.forName(Mappings.getClassName("net.minecraft.util.BlockPos"));

            theWorld = minecraft.getDeclaredField(Mappings.getFieldName("net.minecraft.client.Minecraft", "theWorld"));
            theWorld.setAccessible(true);

            getBlockState = Class.forName(Mappings.getClassName("net.minecraft.world.World")).getDeclaredMethod(Mappings.getMethodName("net.minecraft.world.World", "getBlockState"), blockPos);
            getBlockState.setAccessible(true);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * @return block at a specific position
     */
    public static Block getBlock(Vector3i pos)
    {
        try
        {
            Object bPos = blockPos.getDeclaredConstructor(int.class, int.class, int.class).newInstance(pos.x, pos.y, pos.z);
            Object blockState = getBlockState.invoke(getWorld(), bPos);
            Method blockGetter = blockState.getClass().getDeclaredMethod(Mappings.getMethodName("net.minecraft.block.state.IBlockState", "getBlock"));
            blockGetter.setAccessible(true);

            Object block = blockGetter.invoke(blockState);
            Class<?> blockClass = Class.forName(Mappings.getClassName("net.minecraft.block.Block"));

            /*Field xField = blockClass.getDeclaredField(Mappings.getFieldName("net.minecraft.block.Block", "minX"));
            Field yField = blockClass.getDeclaredField(Mappings.getFieldName("net.minecraft.block.Block", "minY"));
            Field zField = blockClass.getDeclaredField(Mappings.getFieldName("net.minecraft.block.Block", "minZ"));
            xField.setAccessible(true);
            yField.setAccessible(true);
            zField.setAccessible(true);

            int x = (int) xField.getDouble(block);
            int y = (int) yField.getDouble(block);
            int z = (int) zField.getDouble(block);

            return new Block(new Vector3i(x, y, z));*/
            return new Block(new Vector3i(0, 0, 0));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @return instance of the world object
     */
    private static Object getWorld()
    {
        try
        {
            return theWorld.get(DeprecatedMinecraft.getMinecraft());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
