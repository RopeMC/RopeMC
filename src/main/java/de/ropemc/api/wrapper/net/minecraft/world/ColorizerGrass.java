package de.ropemc.api.wrapper.net.minecraft.world;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.ColorizerGrass")
public interface ColorizerGrass {

    int getGrassColor(double var0, double var1);

    void setGrassBiomeColorizer(int[] var0);

}
