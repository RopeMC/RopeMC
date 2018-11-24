package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.net.minecraft.entity.IMerchant;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiMerchant")
public interface GuiMerchant {

    //ResourceLocation access$000();

    void actionPerformed(GuiButton var0);

    void drawGuiContainerBackgroundLayer(float var0, int var1, int var2);

    void drawGuiContainerForegroundLayer(int var0, int var1);

    void drawScreen(int var0, int var1, float var2);

    IMerchant getMerchant();

    void initGui();

    void updateScreen();

}
