package de.ropemc.api.wrapper.net.minecraft.world.gen.structure;

import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.structure.StructureOceanMonument")
public interface StructureOceanMonument {

    boolean canSpawnStructureAtCoords(int var0, int var1);

    List func_175799_b();

    String getStructureName();

    StructureStart getStructureStart(int var0, int var1);

}
