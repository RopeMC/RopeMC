package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.net.minecraft.client.Minecraft;
//import de.ropemc.api.wrapper.net.minecraft.client.settings.GameSettings$Options;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiOptionsRowList")
public interface GuiOptionsRowList {

    //GuiButton func_148182_a(Minecraft var0, int var1, int var2, GameSettings$Options var3);

    //GuiListExtended$IGuiListEntry getListEntry(int var0);

    int getListWidth();

    int getScrollBarX();

    int getSize();

}
