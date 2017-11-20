package de.ropemc.api.world;

import de.ropemc.Mappings;
import de.ropemc.api.Minecraft;

import java.lang.reflect.Field;

public class World {

    private static Object world;

    private static Field theWorld;

    static {
        try {
            Class minecraft = Class.forName(Mappings.getClassName("net.minecraft.client.Minecraft"));

            theWorld = minecraft.getDeclaredField(Mappings.getFieldName("net.minecraft.client.Minecraft","theWorld"));
            theWorld.setAccessible(true);

            world = getWorld();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @return instance of the world object
     */
    public static Object getWorld() {
        try {
            return theWorld.get(Minecraft.getMinecraft());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
