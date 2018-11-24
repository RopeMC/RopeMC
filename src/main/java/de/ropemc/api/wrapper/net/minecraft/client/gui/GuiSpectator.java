package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.net.minecraft.client.gui.spectator.SpectatorMenu;
import de.ropemc.api.wrapper.net.minecraft.client.gui.spectator.categories.SpectatorDetails;
import de.ropemc.api.wrapper.net.minecraft.client.gui.spectator.ISpectatorMenuObject;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiSpectator")
public interface GuiSpectator {

    void func_175257_a(SpectatorMenu var0);

    void func_175258_a(ScaledResolution var0, float var1, int var2, float var3, SpectatorDetails var4);

    void func_175259_b(int var0);

    void func_175260_a(int var0);

    void func_175261_b();

    boolean func_175262_a();

    void func_175263_a(ScaledResolution var0);

    float func_175265_c();

    void func_175266_a(int var0, int var1, float var2, float var3, ISpectatorMenuObject var4);

    void renderTooltip(ScaledResolution var0, float var1);

}
