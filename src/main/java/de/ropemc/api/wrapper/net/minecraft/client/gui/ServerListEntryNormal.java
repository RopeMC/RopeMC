package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.net.minecraft.client.multiplayer.ServerData;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.ServerListEntryNormal")
public interface ServerListEntryNormal {

    //ServerData access$000(ServerListEntryNormal var0);

    //GuiMultiplayer access$100(ServerListEntryNormal var0);

    void drawEntry(int var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7);

    void func_178012_a(int var0, int var1, ResourceLocation var2);

    boolean func_178013_b();

    ServerData getServerData();

    boolean mousePressed(int var0, int var1, int var2, int var3, int var4, int var5);

    void mouseReleased(int var0, int var1, int var2, int var3, int var4, int var5);

    void prepareServerIcon();

    void setSelected(int var0, int var1, int var2);

}
