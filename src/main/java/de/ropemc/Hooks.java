package de.ropemc;

import de.ropemc.api.Keyboard;
import de.ropemc.api.event.EventManager;
import de.ropemc.api.event.game.GameStartEvent;
import de.ropemc.api.event.gui.Render2DEvent;
import de.ropemc.api.event.input.KeyPressedEvent;
import de.ropemc.api.wrapper.net.minecraft.client.Minecraft;
import de.ropemc.utils.ReflectionCache;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Hooks {
    private static List<Integer> lastkeys = new ArrayList<Integer>();

    /**
     * Triggers a KeyPressedEvent
     *
     * @param key
     */
    @Deprecated
    public static void keyHook(int key) {

    }

    private static Object item;
    private static Object block;

    public static void runTickHook() {
        for (int i = 1; i < 255; i++) {
            if (Keyboard.isKeyDown(i)) {
                if (!lastkeys.contains(new Integer(i))) {
                    lastkeys.add(i);
                    EventManager.callEvent(new KeyPressedEvent(i));
                }
            } else {
                if (lastkeys.contains(new Integer(i)))
                    lastkeys.remove(new Integer(i));
            }
        }
    }

    public static void registerItems(){
        System.out.println("Registering Items");
        //registerItem(260, "apple", (new ItemFood(4, 0.3F, false)).setUnlocalizedName("apple"));
        Class itemFoodClazz = ReflectionCache.getClass("net.minecraft.item.ItemFood",true);
        Class itemClazz = ReflectionCache.getClass("net.minecraft.item.Item",true);
        Class blockClazz = ReflectionCache.getClass("net.minecraft.block.Block",true);
        Method registerMethod = ReflectionCache.getMethod("net.minecraft.item.Item","registerItem",true,int.class,String.class,itemClazz);
        Method registerBlockMethod = ReflectionCache.getMethod("net.minecraft.item.Item","registerItemBlock",true,blockClazz);
        Method setUnlocalizedNameMethod = ReflectionCache.getMethod("net.minecraft.item.Item","setUnlocalizedName",true,String.class);
        try {
            Object itemFood = itemFoodClazz.getDeclaredConstructor(int.class,float.class,boolean.class).newInstance(4,0.3F,false);
            setUnlocalizedNameMethod.invoke(itemFood,"custom_apple");
            registerMethod.invoke(null,500,"custom_apple",itemFood);
            item = itemFood;
            registerBlockMethod.invoke(null,block);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void registerBlocks(){
        System.out.println("Registering Blocks");
        Class blockClazz = ReflectionCache.getClass("net.minecraft.block.Block",true);
        Class materialClazz = ReflectionCache.getClass("net.minecraft.block.material.Material",true);
        Field rockField = ReflectionCache.getField("net.minecraft.block.material.Material","rock",true);
        Method registerMethod = ReflectionCache.getMethod("net.minecraft.block.Block","registerBlock",true,int.class,String.class,blockClazz);
        Method setUnlocalizedNameMethod = ReflectionCache.getMethod("net.minecraft.block.Block","setUnlocalizedName",true,String.class);
        try {
            Object materialRock = rockField.get(null);
            Constructor blockConstructor = blockClazz.getDeclaredConstructor(materialClazz);
            blockConstructor.setAccessible(true);
            block = blockConstructor.newInstance(materialRock);
            setUnlocalizedNameMethod.invoke(block,"custom_ore");
            registerMethod.invoke(null,501,"custom_ore",block);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void registerRenderItems(Object renderItem){
        Class itemClass = ReflectionCache.getClass("net.minecraft.item.Item",true);
        Method registerItemMethod = ReflectionCache.getMethod("net.minecraft.client.renderer.entity.RenderItem","registerItem",true,itemClass,int.class,String.class);
        Class blockClass = ReflectionCache.getClass("net.minecraft.block.Block",true);
        Method registerBlockMethod = ReflectionCache.getMethod("net.minecraft.client.renderer.entity.RenderItem","registerBlock",true,blockClass,int.class,String.class);
        try {
            registerItemMethod.invoke(renderItem,item,0,"custom_apple");
            registerBlockMethod.invoke(renderItem,block,0,"custom_ore");
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static void onGameStartHook() {
        EventManager.callEvent(new GameStartEvent());
    }

    /**
     * Triggers a Draw2DEvent
     */
    public static void draw2DHook() {
        EventManager.callEvent(new Render2DEvent());
    }
}
