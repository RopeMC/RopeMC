package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.net.minecraft.client.Minecraft;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiKeyBindingList")
public interface GuiKeyBindingList {

    //Minecraft access$100(GuiKeyBindingList var0);

    //GuiControls access$200(GuiKeyBindingList var0);

    //int access$300(GuiKeyBindingList var0);

    //GuiListExtended$IGuiListEntry getListEntry(int var0);

    int getListWidth();

    int getScrollBarX();

    int getSize();

}
