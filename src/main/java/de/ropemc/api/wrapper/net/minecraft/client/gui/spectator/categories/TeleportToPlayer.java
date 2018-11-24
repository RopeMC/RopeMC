package de.ropemc.api.wrapper.net.minecraft.client.gui.spectator.categories;

import de.ropemc.api.wrapper.net.minecraft.client.gui.spectator.SpectatorMenu;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.spectator.categories.TeleportToPlayer")
public interface TeleportToPlayer {

    void func_178661_a(SpectatorMenu var0);

    boolean func_178662_A_();

    void func_178663_a(float var0, int var1);

    List func_178669_a();

    IChatComponent func_178670_b();

    IChatComponent getSpectatorName();

}
