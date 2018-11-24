package de.ropemc.api.wrapper.net.minecraft.world;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.ColorizerFoliage")
public interface ColorizerFoliage {

    int getFoliageColor(double var0, double var1);

    int getFoliageColorBasic();

    int getFoliageColorBirch();

    int getFoliageColorPine();

    void setFoliageBiomeColorizer(int[] var0);

}
