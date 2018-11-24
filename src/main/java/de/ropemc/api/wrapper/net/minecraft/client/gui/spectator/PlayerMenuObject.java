package de.ropemc.api.wrapper.net.minecraft.client.gui.spectator;

import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.spectator.PlayerMenuObject")
public interface PlayerMenuObject {

    void func_178661_a(SpectatorMenu var0);

    boolean func_178662_A_();

    void func_178663_a(float var0, int var1);

    IChatComponent getSpectatorName();

}
