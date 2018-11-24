package de.ropemc.api.wrapper.net.minecraft.client.gui.inventory;

import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.inventory.Slot;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.inventory.GuiContainer")
public interface GuiContainer {

    boolean checkHotbarKeys(int var0);

    boolean doesGuiPauseGame();

    void drawGuiContainerBackgroundLayer(float var0, int var1, int var2);

    void drawGuiContainerForegroundLayer(int var0, int var1);

    void drawItemStack(ItemStack var0, int var1, int var2, String var3);

    void drawScreen(int var0, int var1, float var2);

    void drawSlot(Slot var0);

    Slot getSlotAtPosition(int var0, int var1);

    void handleMouseClick(Slot var0, int var1, int var2, int var3);

    void initGui();

    boolean isMouseOverSlot(Slot var0, int var1, int var2);

    boolean isPointInRegion(int var0, int var1, int var2, int var3, int var4, int var5);

    void keyTyped(char var0, int var1);

    void mouseClickMove(int var0, int var1, int var2, long var3);

    void mouseClicked(int var0, int var1, int var2);

    void mouseReleased(int var0, int var1, int var2);

    void onGuiClosed();

    void updateDragSplitting();

    void updateScreen();

}
