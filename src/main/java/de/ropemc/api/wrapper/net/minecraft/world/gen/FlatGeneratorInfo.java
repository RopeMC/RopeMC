package de.ropemc.api.wrapper.net.minecraft.world.gen;

import java.util.List;
import java.util.Map;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.FlatGeneratorInfo")
public interface FlatGeneratorInfo {

    FlatGeneratorInfo createFlatGeneratorFromString(String var0);

    FlatLayerInfo func_180715_a(int var0, String var1, int var2);

    List func_180716_a(int var0, String var1);

    void func_82645_d();

    int getBiome();

    FlatGeneratorInfo getDefaultFlatGenerator();

    List getFlatLayers();

    Map getWorldFeatures();

    void setBiome(int var0);

}
