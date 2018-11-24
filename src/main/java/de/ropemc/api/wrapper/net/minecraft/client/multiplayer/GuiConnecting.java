package de.ropemc.api.wrapper.net.minecraft.client.multiplayer;

import de.ropemc.api.wrapper.net.minecraft.network.NetworkManager;
import de.ropemc.api.wrapper.net.minecraft.client.gui.GuiScreen;
//import org.apache.logging.log4j.Logger;
import de.ropemc.api.wrapper.net.minecraft.client.gui.GuiButton;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.multiplayer.GuiConnecting")
public interface GuiConnecting {

    //boolean access$000(GuiConnecting var0);

    //NetworkManager access$100(GuiConnecting var0);

    //NetworkManager access$102(GuiConnecting var0, NetworkManager var1);

    //GuiScreen access$200(GuiConnecting var0);

    //Logger access$300();

    void actionPerformed(GuiButton var0);

    void connect(String var0, int var1);

    void drawScreen(int var0, int var1, float var2);

    void initGui();

    void keyTyped(char var0, int var1);

    void updateScreen();

}
