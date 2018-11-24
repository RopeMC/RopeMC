package de.ropemc.api.wrapper.net.minecraft.entity;

import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.net.minecraft.crash.CrashReportCategory;
import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.entity.item.EntityItem;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.util.Vec3;
import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import de.ropemc.api.wrapper.net.minecraft.command.CommandResultStats;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.world.Explosion;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.event.HoverEvent;
import java.util.UUID;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.block.material.Material;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayerMP;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagList;
import de.ropemc.api.wrapper.net.minecraft.entity.effect.EntityLightningBolt;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.util.MovingObjectPosition;
//import de.ropemc.api.wrapper.net.minecraft.command.CommandResultStats$Type;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.Entity")
public interface Entity {

    void addChatMessage(IChatComponent var0);

    void addEntityCrashInfo(CrashReportCategory var0);

    void addToPlayerScore(Entity var0, int var1);

    void addVelocity(double var0, double var1, double var2);

    void applyEnchantments(EntityLivingBase var0, Entity var1);

    void applyEntityCollision(Entity var0);

    boolean attackEntityFrom(DamageSource var0, float var1);

    boolean canAttackWithItem();

    boolean canBeCollidedWith();

    boolean canBePushed();

    boolean canCommandSenderUseCommand(int var0, String var1);

    boolean canRenderOnFire();

    boolean canTriggerWalking();

    void clientUpdateEntityNBT(NBTTagCompound var0);

    void copyDataFromOld(Entity var0);

    void copyLocationAndAnglesFrom(Entity var0);

    void createRunningParticles();

    void dealFireDamage(int var0);

    void doBlockCollisions();

    boolean doesEntityNotTriggerPressurePlate();

    EntityItem dropItem(Item var0, int var1);

    EntityItem dropItemWithOffset(Item var0, int var1, float var2);

    EntityItem entityDropItem(ItemStack var0, float var1);

    void entityInit();

    void extinguish();

    void fall(float var0, float var1);

    void func_174817_o(Entity var0);

    EnumFacing func_181012_aH();

    void func_181013_g(float var0);

    Vec3 func_181014_aG();

    int getAir();

    boolean getAlwaysRenderNameTag();

    boolean getAlwaysRenderNameTagForRender();

    float getBrightness(float var0);

    int getBrightnessForRender(float var0);

    float getCollisionBorderSize();

    AxisAlignedBB getCollisionBoundingBox();

    AxisAlignedBB getCollisionBox(Entity var0);

    Entity getCommandSenderEntity();

    CommandResultStats getCommandStats();

    String getCustomNameTag();

    DataWatcher getDataWatcher();

    IChatComponent getDisplayName();

    double getDistance(double var0, double var1, double var2);

    double getDistanceSq(double var0, double var1, double var2);

    double getDistanceSq(BlockPos var0);

    double getDistanceSqToCenter(BlockPos var0);

    double getDistanceSqToEntity(Entity var0);

    float getDistanceToEntity(Entity var0);

    AxisAlignedBB getEntityBoundingBox();

    int getEntityId();

    String getEntityString();

    World getEntityWorld();

    float getExplosionResistance(Explosion var0, World var1, BlockPos var2, IBlockState var3);

    float getEyeHeight();

    boolean getFlag(int var0);

    EnumFacing getHorizontalFacing();

    HoverEvent getHoverEvent();

    ItemStack[] getInventory();

    Vec3 getLook(float var0);

    Vec3 getLookVec();

    int getMaxFallHeight();

    int getMaxInPortalTime();

    double getMountedYOffset();

    NBTTagCompound getNBTTagCompound();

    String getName();

    Entity[] getParts();

    int getPortalCooldown();

    BlockPos getPosition();

    Vec3 getPositionEyes(float var0);

    Vec3 getPositionVector();

    float getRotationYawHead();

    String getSplashSound();

    String getSwimSound();

    UUID getUniqueID();

    Vec3 getVectorForRotation(float var0, float var1);

    double getYOffset();

    void handleStatusUpdate(byte var0);

    boolean handleWaterMovement();

    boolean hasCustomName();

    boolean hitByEntity(Entity var0);

    boolean interactAt(EntityPlayer var0, Vec3 var1);

    boolean interactFirst(EntityPlayer var0);

    boolean isBurning();

    boolean isEating();

    boolean isEntityAlive();

    boolean isEntityEqual(Entity var0);

    boolean isEntityInsideOpaqueBlock();

    boolean isEntityInvulnerable(DamageSource var0);

    boolean isImmuneToExplosions();

    boolean isImmuneToFire();

    boolean isInLava();

    boolean isInRangeToRender3d(double var0, double var1, double var2);

    boolean isInRangeToRenderDist(double var0);

    boolean isInWater();

    boolean isInsideOfMaterial(Material var0);

    boolean isInvisible();

    boolean isInvisibleToPlayer(EntityPlayer var0);

    boolean isLiquidPresentInAABB(AxisAlignedBB var0);

    boolean isOffsetPositionInLiquid(double var0, double var1, double var2);

    boolean isOutsideBorder();

    boolean isPushedByWater();

    boolean isRiding();

    boolean isSilent();

    boolean isSneaking();

    boolean isSpectatedByPlayer(EntityPlayerMP var0);

    boolean isSprinting();

    boolean isWet();

    void kill();

    void mountEntity(Entity var0);

    void moveEntity(double var0, double var1, double var2);

    void moveFlying(float var0, float var1, float var2);

    void moveToBlockPosAndAngles(BlockPos var0, float var1, float var2);

    NBTTagList newDoubleNBTList(double[] var0);

    NBTTagList newFloatNBTList(float[] var0);

    void onChunkLoad();

    void onCollideWithPlayer(EntityPlayer var0);

    void onDataWatcherUpdate(int var0);

    void onEntityUpdate();

    void onKillCommand();

    void onKillEntity(EntityLivingBase var0);

    void onStruckByLightning(EntityLightningBolt var0);

    void onUpdate();

    void performHurtAnimation();

    void playSound(String var0, float var1, float var2);

    void playStepSound(BlockPos var0, Block var1);

    void preparePlayerToSpawn();

    boolean pushOutOfBlocks(double var0, double var1, double var2);

    MovingObjectPosition rayTrace(double var0, float var1);

    void readEntityFromNBT(NBTTagCompound var0);

    void readFromNBT(NBTTagCompound var0);

    boolean replaceItemInInventory(int var0, ItemStack var1);

    void resetHeight();

    void resetPositionToBB();

    boolean sendCommandFeedback();

    void setAir(int var0);

    void setAlwaysRenderNameTag(boolean var0);

    void setAngles(float var0, float var1);

    void setBeenAttacked();

    //void setCommandStat(CommandResultStats$Type var0, int var1);

    void setCurrentItemOrArmor(int var0, ItemStack var1);

    void setCustomNameTag(String var0);

    void setDead();

    void setEating(boolean var0);

    void setEntityBoundingBox(AxisAlignedBB var0);

    void setEntityId(int var0);

    void setFire(int var0);

    void setFlag(int var0, boolean var1);

    void setInWeb();

    void setInvisible(boolean var0);

    void setLocationAndAngles(double var0, double var1, double var2, float var3, float var4);

    void setOnFireFromLava();

    void setOutsideBorder(boolean var0);

    void setPortal(BlockPos var0);

    void setPosition(double var0, double var1, double var2);

    void setPositionAndRotation(double var0, double var1, double var2, float var3, float var4);

    void setPositionAndRotation2(double var0, double var1, double var2, float var3, float var4, int var5, boolean var6);

    void setPositionAndUpdate(double var0, double var1, double var2);

    void setRotation(float var0, float var1);

    void setRotationYawHead(float var0);

    void setSilent(boolean var0);

    void setSize(float var0, float var1);

    void setSneaking(boolean var0);

    void setSprinting(boolean var0);

    void setVelocity(double var0, double var1, double var2);

    void setWorld(World var0);

    boolean shouldSetPosAfterLoading();

    void spawnRunningParticles();

    void travelToDimension(int var0);

    void updateFallState(double var0, boolean var1, Block var2, BlockPos var3);

    void updateRidden();

    void updateRiderPosition();

    boolean verifyExplosion(Explosion var0, World var1, BlockPos var2, IBlockState var3, float var4);

    void writeEntityToNBT(NBTTagCompound var0);

    boolean writeMountToNBT(NBTTagCompound var0);

    void writeToNBT(NBTTagCompound var0);

    boolean writeToNBTOptional(NBTTagCompound var0);

}
