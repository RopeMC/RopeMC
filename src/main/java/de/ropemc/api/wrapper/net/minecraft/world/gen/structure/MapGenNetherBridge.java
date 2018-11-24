package de.ropemc.api.wrapper.net.minecraft.world.gen.structure;

import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.structure.MapGenNetherBridge")
public interface MapGenNetherBridge {

    boolean canSpawnStructureAtCoords(int var0, int var1);

    List getSpawnList();

    String getStructureName();

    StructureStart getStructureStart(int var0, int var1);

}
