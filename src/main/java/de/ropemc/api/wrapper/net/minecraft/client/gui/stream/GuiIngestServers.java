package de.ropemc.api.wrapper.net.minecraft.client.gui.stream;

import de.ropemc.api.wrapper.net.minecraft.client.gui.FontRenderer;
import de.ropemc.api.wrapper.net.minecraft.client.gui.GuiButton;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.stream.GuiIngestServers")
public interface GuiIngestServers {

    //FontRenderer access$000(GuiIngestServers var0);

    //FontRenderer access$100(GuiIngestServers var0);

    //FontRenderer access$200(GuiIngestServers var0);

    //FontRenderer access$300(GuiIngestServers var0);

    //FontRenderer access$400(GuiIngestServers var0);

    //FontRenderer access$500(GuiIngestServers var0);

    //FontRenderer access$600(GuiIngestServers var0);

    //FontRenderer access$700(GuiIngestServers var0);

    void actionPerformed(GuiButton var0);

    void drawScreen(int var0, int var1, float var2);

    void handleMouseInput();

    void initGui();

    void onGuiClosed();

}
