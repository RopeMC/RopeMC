package de.ropemc.api.wrapper.net.minecraft.client.gui.inventory;

import de.ropemc.api.wrapper.net.minecraft.client.gui.GuiButton;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.inventory.GuiInventory")
public interface GuiInventory {

    void actionPerformed(GuiButton var0);

    void drawEntityOnScreen(int var0, int var1, int var2, float var3, float var4, EntityLivingBase var5);

    void drawGuiContainerBackgroundLayer(float var0, int var1, int var2);

    void drawGuiContainerForegroundLayer(int var0, int var1);

    void drawScreen(int var0, int var1, float var2);

    void initGui();

    void updateScreen();

}
