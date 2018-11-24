package de.ropemc.api.wrapper.net.minecraft.village;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.village.VillageDoorInfo")
public interface VillageDoorInfo {

    void func_179849_a(int var0);

    boolean func_179850_c(BlockPos var0);

    int getDistanceSquared(int var0, int var1, int var2);

    int getDistanceToDoorBlockSq(BlockPos var0);

    int getDistanceToInsideBlockSq(BlockPos var0);

    BlockPos getDoorBlockPos();

    int getDoorOpeningRestrictionCounter();

    EnumFacing getFaceDirection(int var0, int var1);

    BlockPos getInsideBlockPos();

    int getInsideOffsetX();

    int getInsideOffsetZ();

    int getInsidePosY();

    boolean getIsDetachedFromVillageFlag();

    void incrementDoorOpeningRestrictionCounter();

    void resetDoorOpeningRestrictionCounter();

    void setIsDetachedFromVillageFlag(boolean var0);

}
