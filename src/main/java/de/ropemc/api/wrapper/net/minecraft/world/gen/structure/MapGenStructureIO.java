package de.ropemc.api.wrapper.net.minecraft.world.gen.structure;

import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.structure.MapGenStructureIO")
public interface MapGenStructureIO {

    StructureComponent getStructureComponent(NBTTagCompound var0, World var1);

    String getStructureComponentName(StructureComponent var0);

    StructureStart getStructureStart(NBTTagCompound var0, World var1);

    String getStructureStartName(StructureStart var0);

    void registerStructure(Class var0, String var1);

    void registerStructureComponent(Class var0, String var1);

}
