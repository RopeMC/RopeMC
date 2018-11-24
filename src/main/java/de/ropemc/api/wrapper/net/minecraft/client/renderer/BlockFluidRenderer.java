package de.ropemc.api.wrapper.net.minecraft.client.renderer;

import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.material.Material;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.BlockFluidRenderer")
public interface BlockFluidRenderer {

    float getFluidHeight(IBlockAccess var0, BlockPos var1, Material var2);

    void initAtlasSprites();

    boolean renderFluid(IBlockAccess var0, IBlockState var1, BlockPos var2, WorldRenderer var3);

}
