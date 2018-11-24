package de.ropemc.api.wrapper.net.minecraft.server.gui;

import de.ropemc.api.wrapper.net.minecraft.server.dedicated.DedicatedServer;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JComponent;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.server.gui.MinecraftServerGui")
public interface MinecraftServerGui {

    //DedicatedServer access$000(MinecraftServerGui var0);

    void createServerGui(DedicatedServer var0);

    void func_164247_a(JTextArea var0, JScrollPane var1, String var2);

    JComponent getLogComponent();

    JComponent getPlayerListComponent();

    JComponent getStatsComponent();

}
