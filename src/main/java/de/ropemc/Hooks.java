package de.ropemc;

import de.ropemc.api.DeprecatedMinecraft;
import de.ropemc.api.Keyboard;
import de.ropemc.api.event.EventManager;
import de.ropemc.api.event.gui.Render2DEvent;
import de.ropemc.api.event.gui.WindowTitleChangeEvent;
import de.ropemc.api.event.input.KeyPressedEvent;
import de.ropemc.mods.ModManager;

import java.util.ArrayList;
import java.util.List;

public class Hooks {
    private static List<Integer> lastkeys = new ArrayList<Integer>();

    /**
     * @param title
     */
    public static void titleHook(String title) {
        DeprecatedMinecraft.setWindowTitle("RopeMC v" + RopeMC.ROPE_VERSION + " (" + de.ropemc.api.wrapper.net.minecraft.client.Minecraft.getTheMinecraft().getLaunchedVersion() + ") [" + ModManager.getModules().size() + " mods loaded]");
        EventManager.callEvent(new WindowTitleChangeEvent(title));
    }

    /**
     * Triggers a KeyPressedEvent
     *
     * @param key
     */
    @Deprecated
    public static void keyHook(int key) {

    }

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

    /**
     * Triggers a Draw2DEvent
     */
    public static void draw2DHook() {
        EventManager.callEvent(new Render2DEvent());
    }
}
