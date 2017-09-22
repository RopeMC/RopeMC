package de.ropemc;

import de.ropemc.api.Minecraft;
import de.ropemc.event.EventManager;
import de.ropemc.event.window.KeyPressedEvent;
import de.ropemc.event.window.WindowTitleChangeEvent;
import de.ropemc.mods.ModManager;

public class Hooks {

    public static void titleHook(String title) {
    	Minecraft.setWindowTitle("RopeMC v" + RopeMC.ROPE_VERSION + " ("+Minecraft.getMinecraftVersion()+") [" + ModManager.getModules().size() + " mods loaded]");
        EventManager.callEvent(new WindowTitleChangeEvent(title));
    }

    public static void keyHook(int key) {
        EventManager.callEvent(new KeyPressedEvent(key));
    }

}
