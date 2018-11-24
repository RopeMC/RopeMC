package de.ropemc.api.wrapper.net.minecraft.client.gui;

import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.client.resources.ResourcePackListEntry;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiScreenResourcePacks")
public interface GuiScreenResourcePacks {

    void actionPerformed(GuiButton var0);

    void drawScreen(int var0, int var1, float var2);

    List getAvailableResourcePacks();

    List getListContaining(ResourcePackListEntry var0);

    List getSelectedResourcePacks();

    void handleMouseInput();

    boolean hasResourcePackEntry(ResourcePackListEntry var0);

    void initGui();

    void markChanged();

    void mouseClicked(int var0, int var1, int var2);

    void mouseReleased(int var0, int var1, int var2);

}
