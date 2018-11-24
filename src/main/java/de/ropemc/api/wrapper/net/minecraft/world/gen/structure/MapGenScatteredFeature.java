package de.ropemc.api.wrapper.net.minecraft.world.gen.structure;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.structure.MapGenScatteredFeature")
public interface MapGenScatteredFeature {

    boolean canSpawnStructureAtCoords(int var0, int var1);

    boolean func_175798_a(BlockPos var0);

    List getScatteredFeatureSpawnList();

    String getStructureName();

    StructureStart getStructureStart(int var0, int var1);

}
