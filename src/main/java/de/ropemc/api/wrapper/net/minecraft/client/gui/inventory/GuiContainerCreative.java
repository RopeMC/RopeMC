package de.ropemc.api.wrapper.net.minecraft.client.gui.inventory;

import de.ropemc.api.wrapper.net.minecraft.inventory.InventoryBasic;
import de.ropemc.api.wrapper.net.minecraft.client.gui.GuiButton;
import de.ropemc.api.wrapper.net.minecraft.creativetab.CreativeTabs;
import de.ropemc.api.wrapper.net.minecraft.inventory.Slot;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.inventory.GuiContainerCreative")
public interface GuiContainerCreative {

    //InventoryBasic access$000();

    void actionPerformed(GuiButton var0);

    void drawGuiContainerBackgroundLayer(float var0, int var1, int var2);

    void drawGuiContainerForegroundLayer(int var0, int var1);

    void drawScreen(int var0, int var1, float var2);

    boolean func_147049_a(CreativeTabs var0, int var1, int var2);

    void func_147051_a(CreativeTabs var0);

    int getSelectedTabIndex();

    void handleMouseClick(Slot var0, int var1, int var2, int var3);

    void handleMouseInput();

    void initGui();

    void keyTyped(char var0, int var1);

    void mouseClicked(int var0, int var1, int var2);

    void mouseReleased(int var0, int var1, int var2);

    boolean needsScrollBars();

    void onGuiClosed();

    boolean renderCreativeInventoryHoveringText(CreativeTabs var0, int var1, int var2);

    void renderToolTip(ItemStack var0, int var1, int var2);

    void setCurrentCreativeTab(CreativeTabs var0);

    void updateActivePotionEffects();

    void updateCreativeSearch();

    void updateScreen();

}
