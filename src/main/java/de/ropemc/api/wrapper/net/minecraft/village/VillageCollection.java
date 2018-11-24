package de.ropemc.api.wrapper.net.minecraft.village;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.world.WorldProvider;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.village.VillageCollection")
public interface VillageCollection {

    void addDoorsAround(BlockPos var0);

    void addNewDoorsToVillageOrCreateVillage();

    void addToNewDoorsList(BlockPos var0);

    void addToVillagerPositionList(BlockPos var0);

    VillageDoorInfo checkDoorExistence(BlockPos var0);

    int countBlocksCanSeeSky(BlockPos var0, EnumFacing var1, int var2);

    void dropOldestVillagerPosition();

    String fileNameForProvider(WorldProvider var0);

    Village getNearestVillage(BlockPos var0, int var1);

    List getVillageList();

    boolean isWoodDoor(BlockPos var0);

    boolean positionInList(BlockPos var0);

    void readFromNBT(NBTTagCompound var0);

    void removeAnnihilatedVillages();

    void setWorldsForAll(World var0);

    void tick();

    void writeToNBT(NBTTagCompound var0);

}
