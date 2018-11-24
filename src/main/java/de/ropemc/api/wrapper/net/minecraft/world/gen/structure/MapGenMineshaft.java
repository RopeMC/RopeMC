package de.ropemc.api.wrapper.net.minecraft.world.gen.structure;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.structure.MapGenMineshaft")
public interface MapGenMineshaft {

    boolean canSpawnStructureAtCoords(int var0, int var1);

    String getStructureName();

    StructureStart getStructureStart(int var0, int var1);

}
