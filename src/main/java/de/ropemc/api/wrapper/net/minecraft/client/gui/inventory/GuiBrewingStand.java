package de.ropemc.api.wrapper.net.minecraft.client.gui.inventory;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.inventory.GuiBrewingStand")
public interface GuiBrewingStand {

    void drawGuiContainerBackgroundLayer(float var0, int var1, int var2);

    void drawGuiContainerForegroundLayer(int var0, int var1);

}
