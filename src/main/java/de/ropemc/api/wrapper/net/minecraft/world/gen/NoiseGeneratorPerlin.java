package de.ropemc.api.wrapper.net.minecraft.world.gen;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.NoiseGeneratorPerlin")
public interface NoiseGeneratorPerlin {

    double[] func_151599_a(double[] var0, double var1, double var2, int var3, int var4, double var5, double var6, double var7);

    double[] func_151600_a(double[] var0, double var1, double var2, int var3, int var4, double var5, double var6, double var7, double var8);

    double func_151601_a(double var0, double var1);

}
