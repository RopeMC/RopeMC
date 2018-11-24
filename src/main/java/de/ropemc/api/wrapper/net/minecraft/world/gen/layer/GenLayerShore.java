package de.ropemc.api.wrapper.net.minecraft.world.gen.layer;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.layer.GenLayerShore")
public interface GenLayerShore {

    boolean func_151631_c(int var0);

    void func_151632_a(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6);

    boolean func_151633_d(int var0);

    int[] getInts(int var0, int var1, int var2, int var3);

}
