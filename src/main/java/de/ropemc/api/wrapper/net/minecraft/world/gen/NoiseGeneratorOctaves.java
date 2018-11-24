package de.ropemc.api.wrapper.net.minecraft.world.gen;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.NoiseGeneratorOctaves")
public interface NoiseGeneratorOctaves {

    double[] generateNoiseOctaves(double[] var0, int var1, int var2, int var3, int var4, double var5, double var6, double var7);

    double[] generateNoiseOctaves(double[] var0, int var1, int var2, int var3, int var4, int var5, int var6, double var7, double var8, double var9);

}
