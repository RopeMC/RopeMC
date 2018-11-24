package de.ropemc.api.wrapper.net.minecraft.client.multiplayer;

import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.client.Minecraft;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.stats.StatFileWriter;
import de.ropemc.api.wrapper.net.minecraft.client.entity.EntityPlayerSP;
import de.ropemc.api.wrapper.net.minecraft.util.MovingObjectPosition;
//import de.ropemc.api.wrapper.net.minecraft.world.WorldSettings$GameType;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.util.Vec3;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.multiplayer.PlayerControllerMP")
public interface PlayerControllerMP {

    void attackEntity(EntityPlayer var0, Entity var1);

    boolean clickBlock(BlockPos var0, EnumFacing var1);

    void clickBlockCreative(Minecraft var0, PlayerControllerMP var1, BlockPos var2, EnumFacing var3);

    boolean extendedReach();

    void flipPlayer(EntityPlayer var0);

    EntityPlayerSP func_178892_a(World var0, StatFileWriter var1);

    boolean func_178894_a(EntityPlayer var0, Entity var1, MovingObjectPosition var2);

    boolean func_181040_m();

    boolean gameIsSurvivalOrAdventure();

    float getBlockReachDistance();

    //WorldSettings$GameType getCurrentGameType();

    boolean interactWithEntitySendPacket(EntityPlayer var0, Entity var1);

    boolean isHittingPosition(BlockPos var0);

    boolean isInCreativeMode();

    boolean isNotCreative();

    boolean isRidingHorse();

    boolean isSpectator();

    boolean isSpectatorMode();

    boolean onPlayerDamageBlock(BlockPos var0, EnumFacing var1);

    boolean onPlayerDestroyBlock(BlockPos var0, EnumFacing var1);

    boolean onPlayerRightClick(EntityPlayerSP var0, WorldClient var1, ItemStack var2, BlockPos var3, EnumFacing var4, Vec3 var5);

    void onStoppedUsingItem(EntityPlayer var0);

    void resetBlockRemoving();

    void sendEnchantPacket(int var0, int var1);

    void sendPacketDropItem(ItemStack var0);

    void sendSlotPacket(ItemStack var0, int var1);

    boolean sendUseItem(EntityPlayer var0, World var1, ItemStack var2);

    //void setGameType(WorldSettings$GameType var0);

    void setPlayerCapabilities(EntityPlayer var0);

    boolean shouldDrawHUD();

    void syncCurrentPlayItem();

    void updateController();

    ItemStack windowClick(int var0, int var1, int var2, int var3, EntityPlayer var4);

}
