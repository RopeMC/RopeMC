package de.ropemc.api.wrapper.net.minecraft.client.entity;

import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.net.minecraft.stats.StatBase;
import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.inventory.IInventory;
import de.ropemc.api.wrapper.net.minecraft.entity.passive.EntityHorse;
import de.ropemc.api.wrapper.net.minecraft.world.IInteractionObject;
import de.ropemc.api.wrapper.net.minecraft.entity.IMerchant;
import de.ropemc.api.wrapper.net.minecraft.entity.item.EntityItem;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.stats.StatFileWriter;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.command.server.CommandBlockLogic;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntitySign;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.entity.EntityPlayerSP")
public interface EntityPlayerSP extends AbstractClientPlayer {

    void addChatComponentMessage(IChatComponent var0);

    void addChatMessage(IChatComponent var0);

    void addStat(StatBase var0, int var1);

    boolean attackEntityFrom(DamageSource var0, float var1);

    boolean canCommandSenderUseCommand(int var0, String var1);

    void closeScreen();

    void closeScreenAndDropStack();

    void damageEntity(DamageSource var0, float var1);

    void displayGUIBook(ItemStack var0);

    void displayGUIChest(IInventory var0);

    void displayGUIHorse(EntityHorse var0, IInventory var1);

    void displayGui(IInteractionObject var0);

    void displayVillagerTradeGui(IMerchant var0);

    EntityItem dropOneItem(boolean var0);

    String getClientBrand();

    float getHorseJumpPower();

    BlockPos getPosition();

    StatFileWriter getStatFileWriter();

    void heal(float var0);

    boolean isCurrentViewEntity();

    boolean isOpenBlockSpace(BlockPos var0);

    boolean isRidingHorse();

    boolean isServerWorld();

    boolean isSneaking();

    boolean isUser();

    void joinEntityItemWithWorld(EntityItem var0);

    void mountEntity(Entity var0);

    void onCriticalHit(Entity var0);

    void onEnchantmentCritical(Entity var0);

    void onLivingUpdate();

    void onUpdate();

    void onUpdateWalkingPlayer();

    void openEditCommandBlock(CommandBlockLogic var0);

    void openEditSign(TileEntitySign var0);

    void playSound(String var0, float var1, float var2);

    boolean pushOutOfBlocks(double var0, double var1, double var2);

    void respawnPlayer();

    void sendChatMessage(String var0);

    void sendHorseInventory();

    void sendHorseJump();

    void sendPlayerAbilities();

    void setClientBrand(String var0);

    void setPlayerSPHealth(float var0);

    void setSprinting(boolean var0);

    void setXPStats(float var0, int var1, int var2);

    void swingItem();

    void updateEntityActionState();

}
