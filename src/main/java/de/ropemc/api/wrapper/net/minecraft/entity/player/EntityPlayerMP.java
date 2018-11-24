package de.ropemc.api.wrapper.net.minecraft.entity.player;

import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.net.minecraft.stats.StatBase;
import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.inventory.IInventory;
import de.ropemc.api.wrapper.net.minecraft.entity.passive.EntityHorse;
import de.ropemc.api.wrapper.net.minecraft.world.IInteractionObject;
import de.ropemc.api.wrapper.net.minecraft.entity.IMerchant;
import de.ropemc.api.wrapper.net.minecraft.inventory.Container;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.world.WorldServer;
import de.ropemc.api.wrapper.net.minecraft.stats.StatisticsFile;
import de.ropemc.api.wrapper.net.minecraft.network.play.client.C15PacketClientSettings;
import de.ropemc.api.wrapper.net.minecraft.potion.PotionEffect;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntitySign;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntity;
//import de.ropemc.api.wrapper.net.minecraft.world.WorldSettings$GameType;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.player.EntityPlayerMP")
public interface EntityPlayerMP {

    void addChatComponentMessage(IChatComponent var0);

    void addChatMessage(IChatComponent var0);

    void addExperienceLevel(int var0);

    void addSelfToInternalCraftingInventory();

    void addStat(StatBase var0, int var1);

    boolean attackEntityFrom(DamageSource var0, float var1);

    void attackTargetEntityWithCurrentItem(Entity var0);

    boolean canAttackPlayer(EntityPlayer var0);

    boolean canCommandSenderUseCommand(int var0, String var1);

    boolean canPlayersAttack();

    void clonePlayer(EntityPlayer var0, boolean var1);

    void closeContainer();

    void closeScreen();

    void displayGUIBook(ItemStack var0);

    void displayGUIChest(IInventory var0);

    void displayGUIHorse(EntityHorse var0, IInventory var1);

    void displayGui(IInteractionObject var0);

    void displayVillagerTradeGui(IMerchant var0);

    void func_175145_a(StatBase var0);

    void func_175173_a(Container var0, IInventory var1);

    //EntityPlayer$EnumChatVisibility getChatVisibility();

    long getLastActiveTime();

    void getNextWindowId();

    String getPlayerIP();

    BlockPos getPosition();

    WorldServer getServerForPlayer();

    Entity getSpectatingEntity();

    StatisticsFile getStatFile();

    IChatComponent getTabListDisplayName();

    void handleClientSettings(C15PacketClientSettings var0);

    void handleFalling(double var0, boolean var1);

    boolean isSpectatedByPlayer(EntityPlayerMP var0);

    boolean isSpectator();

    void loadResourcePack(String var0, String var1);

    void markPlayerActive();

    void mountEntity(Entity var0);

    void mountEntityAndWakeUp();

    void onChangedPotionEffect(PotionEffect var0, boolean var1);

    void onCriticalHit(Entity var0);

    void onDeath(DamageSource var0);

    void onEnchantmentCritical(Entity var0);

    void onFinishedPotionEffect(PotionEffect var0);

    void onItemPickup(Entity var0, int var1);

    void onItemUseFinish();

    void onNewPotionEffect(PotionEffect var0);

    void onUpdate();

    void onUpdateEntity();

    void openEditSign(TileEntitySign var0);

    void readEntityFromNBT(NBTTagCompound var0);

    void removeEntity(Entity var0);

    void removeExperienceLevel(int var0);

    void sendContainerToPlayer(Container var0);

    void sendEndCombat();

    void sendEnterCombat();

    void sendPlayerAbilities();

    void sendProgressBarUpdate(Container var0, int var1, int var2);

    void sendSlotContents(Container var0, int var1, ItemStack var2);

    void sendTileEntityUpdate(TileEntity var0);

    void setEntityActionState(float var0, float var1, boolean var2, boolean var3);

    //void setGameType(WorldSettings$GameType var0);

    void setItemInUse(ItemStack var0, int var1);

    void setPlayerHealthUpdated();

    void setPositionAndUpdate(double var0, double var1, double var2);

    void setSpectatingEntity(Entity var0);

    void travelToDimension(int var0);

    //EntityPlayer$EnumStatus trySleep(BlockPos var0);

    void updateBiomesExplored();

    void updateCraftingInventory(Container var0, List var1);

    void updateFallState(double var0, boolean var1, Block var2, BlockPos var3);

    void updateHeldItem();

    void updatePotionMetadata();

    void wakeUpPlayer(boolean var0, boolean var1, boolean var2);

    void writeEntityToNBT(NBTTagCompound var0);

}
