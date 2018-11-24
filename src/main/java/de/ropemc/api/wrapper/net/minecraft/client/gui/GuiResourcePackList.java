package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.net.minecraft.client.renderer.Tessellator;
import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiResourcePackList")
public interface GuiResourcePackList {

    void drawListHeader(int var0, int var1, Tessellator var2);

    List getList();

    //GuiListExtended$IGuiListEntry getListEntry(int var0);

    String getListHeader();

    int getListWidth();

    int getScrollBarX();

    int getSize();

}
