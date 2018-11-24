package de.ropemc.api.wrapper.net.minecraft.server.management;

import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
//import de.ropemc.api.wrapper.net.minecraft.world.WorldSettings$GameType;
import de.ropemc.api.wrapper.net.minecraft.world.WorldServer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.server.management.ItemInWorldManager")
public interface ItemInWorldManager {

    boolean activateBlockOrUseItem(EntityPlayer var0, World var1, ItemStack var2, BlockPos var3, EnumFacing var4, float var5, float var6, float var7);

    void blockRemoving(BlockPos var0);

    void cancelDestroyingBlock();

    //WorldSettings$GameType getGameType();

    //void initializeGameType(WorldSettings$GameType var0);

    boolean isCreative();

    void onBlockClicked(BlockPos var0, EnumFacing var1);

    boolean removeBlock(BlockPos var0);

    //void setGameType(WorldSettings$GameType var0);

    void setWorld(WorldServer var0);

    boolean survivalOrAdventure();

    boolean tryHarvestBlock(BlockPos var0);

    boolean tryUseItem(EntityPlayer var0, World var1, ItemStack var2);

    void updateBlockRemoving();

}
