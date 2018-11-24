package de.ropemc.api.wrapper.net.minecraft.client.gui;

import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.client.multiplayer.ServerList;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.ServerSelectionList")
public interface ServerSelectionList {

    int func_148193_k();

    void func_148194_a(List var0);

    void func_148195_a(ServerList var0);

    //GuiListExtended$IGuiListEntry getListEntry(int var0);

    int getListWidth();

    int getScrollBarX();

    int getSize();

    boolean isSelected(int var0);

    void setSelectedSlotIndex(int var0);

}
