package de.ropemc.api.wrapper.net.minecraft.client.gui.inventory;

import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.net.minecraft.client.gui.GuiButton;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.inventory.GuiBeacon")
public interface GuiBeacon {

    //ResourceLocation access$000();

    //void access$100(GuiBeacon var0, String var1, int var2, int var3);

    //void access$200(GuiBeacon var0, String var1, int var2, int var3);

    //void access$300(GuiBeacon var0, String var1, int var2, int var3);

    void actionPerformed(GuiButton var0);

    void drawGuiContainerBackgroundLayer(float var0, int var1, int var2);

    void drawGuiContainerForegroundLayer(int var0, int var1);

    void initGui();

    void updateScreen();

}
