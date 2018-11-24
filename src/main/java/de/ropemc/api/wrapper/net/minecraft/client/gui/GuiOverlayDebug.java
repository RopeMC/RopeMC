package de.ropemc.api.wrapper.net.minecraft.client.gui;

import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.GuiOverlayDebug")
public interface GuiOverlayDebug {

    long bytesToMb(long var0);

    List call();

    int func_181552_c(int var0, int var1, int var2, int var3);

    int func_181553_a(int var0, int var1, float var2);

    void func_181554_e();

    List getDebugInfoRight();

    boolean isReducedDebug();

    void renderDebugInfo(ScaledResolution var0);

    void renderDebugInfoLeft();

    void renderDebugInfoRight(ScaledResolution var0);

}
