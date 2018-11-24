package de.ropemc.api.wrapper.net.minecraft.world.gen;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.NoiseGeneratorImproved")
public interface NoiseGeneratorImproved {

    double func_76309_a(int var0, double var1, double var2);

    double grad(int var0, double var1, double var2, double var3);

    double lerp(double var0, double var1, double var2);

    void populateNoiseArray(double[] var0, double var1, double var2, double var3, int var4, int var5, int var6, double var7, double var8, double var9, double var10);

}
