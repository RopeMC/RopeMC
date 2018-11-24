package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntity;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.dispenser.IBehaviorDispenseItem;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockDropper")
public interface BlockDropper {

    TileEntity createNewTileEntity(World var0, int var1);

    void dispense(World var0, BlockPos var1);

    IBehaviorDispenseItem getBehavior(ItemStack var0);

}
