package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.ServerListEntryLanScan")
public interface ServerListEntryLanScan {

    void drawEntry(int var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7);

    boolean mousePressed(int var0, int var1, int var2, int var3, int var4, int var5);

    void mouseReleased(int var0, int var1, int var2, int var3, int var4, int var5);

    void setSelected(int var0, int var1, int var2);

}
