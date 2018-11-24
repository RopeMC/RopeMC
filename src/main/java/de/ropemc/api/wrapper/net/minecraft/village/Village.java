package de.ropemc.api.wrapper.net.minecraft.village;

import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.util.Vec3;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.village.Village")
public interface Village {

    void addOrRenewAgressor(EntityLivingBase var0);

    void addVillageDoorInfo(VillageDoorInfo var0);

    void endMatingSeason();

    EntityLivingBase findNearestVillageAggressor(EntityLivingBase var0);

    boolean func_179861_a(BlockPos var0, BlockPos var1);

    Vec3 func_179862_a(BlockPos var0, int var1, int var2, int var3);

    boolean func_179866_a(BlockPos var0);

    BlockPos getCenter();

    VillageDoorInfo getDoorInfo(BlockPos var0);

    VillageDoorInfo getExistedDoor(BlockPos var0);

    VillageDoorInfo getNearestDoor(BlockPos var0);

    EntityPlayer getNearestTargetPlayer(EntityLivingBase var0);

    int getNumVillageDoors();

    int getNumVillagers();

    int getReputationForPlayer(String var0);

    int getTicksSinceLastDoorAdding();

    List getVillageDoorInfoList();

    int getVillageRadius();

    boolean isAnnihilated();

    boolean isMatingSeason();

    boolean isPlayerReputationTooLow(String var0);

    boolean isWoodDoor(BlockPos var0);

    void readVillageDataFromNBT(NBTTagCompound var0);

    void removeDeadAndOldAgressors();

    void removeDeadAndOutOfRangeDoors();

    void setDefaultPlayerReputation(int var0);

    int setReputationForPlayer(String var0, int var1);

    void setWorld(World var0);

    void tick(int var0);

    void updateNumIronGolems();

    void updateNumVillagers();

    void updateVillageRadiusAndCenter();

    void writeVillageDataToNBT(NBTTagCompound var0);

}
