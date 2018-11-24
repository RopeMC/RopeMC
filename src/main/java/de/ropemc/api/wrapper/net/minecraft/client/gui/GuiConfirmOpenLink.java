package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiConfirmOpenLink")
public interface GuiConfirmOpenLink {

    void actionPerformed(GuiButton var0);

    void copyLinkToClipboard();

    void disableSecurityWarning();

    void drawScreen(int var0, int var1, float var2);

    void initGui();

}
