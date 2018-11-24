package de.ropemc.api.wrapper.net.minecraft.entity.monster;

import de.ropemc.api.wrapper.net.minecraft.entity.ai.EntityAIWander;
import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.pathfinding.PathNavigate;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.monster.EntityGuardian")
public interface EntityGuardian {

    //void access$000(EntityGuardian var0, int var1);

    //EntityAIWander access$100(EntityGuardian var0);

    //void access$200(EntityGuardian var0, boolean var1);

    void addRandomDrop();

    void applyEntityAttributes();

    boolean attackEntityFrom(DamageSource var0, float var1);

    boolean canTriggerWalking();

    void dropFewItems(boolean var0, int var1);

    void entityInit();

    int func_175464_ck();

    float func_175469_o(float var0);

    float func_175471_a(float var0);

    boolean func_175472_n();

    void func_175476_l(boolean var0);

    float func_175477_p(float var0);

    float getBlockPathWeight(BlockPos var0);

    boolean getCanSpawnHere();

    String getDeathSound();

    float getEyeHeight();

    String getHurtSound();

    String getLivingSound();

    PathNavigate getNewNavigator(World var0);

    int getTalkInterval();

    EntityLivingBase getTargetedEntity();

    int getVerticalFaceSpeed();

    boolean hasTargetedEntity();

    boolean isElder();

    boolean isNotColliding();

    boolean isSyncedFlagSet(int var0);

    boolean isValidLightLevel();

    void moveEntityWithHeading(float var0, float var1);

    void onDataWatcherUpdate(int var0);

    void onLivingUpdate();

    void readEntityFromNBT(NBTTagCompound var0);

    void setElder();

    void setElder(boolean var0);

    void setSyncedFlag(int var0, boolean var1);

    void setTargetedEntity(int var0);

    void updateAITasks();

    void writeEntityToNBT(NBTTagCompound var0);

}
