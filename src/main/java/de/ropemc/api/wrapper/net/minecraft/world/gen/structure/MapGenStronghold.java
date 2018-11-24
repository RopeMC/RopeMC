package de.ropemc.api.wrapper.net.minecraft.world.gen.structure;

import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.structure.MapGenStronghold")
public interface MapGenStronghold {

    boolean canSpawnStructureAtCoords(int var0, int var1);

    List getCoordList();

    String getStructureName();

    StructureStart getStructureStart(int var0, int var1);

}
