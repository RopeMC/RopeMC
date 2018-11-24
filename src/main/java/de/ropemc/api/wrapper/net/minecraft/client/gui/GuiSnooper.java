package de.ropemc.api.wrapper.net.minecraft.client.gui;

import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiSnooper")
public interface GuiSnooper {

    //List access$000(GuiSnooper var0);

    //List access$100(GuiSnooper var0);

    void actionPerformed(GuiButton var0);

    void drawScreen(int var0, int var1, float var2);

    void handleMouseInput();

    void initGui();

}
