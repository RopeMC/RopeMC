package de.ropemc.api.wrapper.net.minecraft.client.renderer;

import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.client.resources.model.IBakedModel;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.client.resources.IResourceManager;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.texture.TextureAtlasSprite;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.BlockRendererDispatcher")
public interface BlockRendererDispatcher {

    IBakedModel getBakedModel(IBlockState var0, BlockPos var1);

    BlockModelRenderer getBlockModelRenderer();

    BlockModelShapes getBlockModelShapes();

    IBakedModel getModelFromBlockState(IBlockState var0, IBlockAccess var1, BlockPos var2);

    boolean isRenderTypeChest(Block var0, int var1);

    void onResourceManagerReload(IResourceManager var0);

    boolean renderBlock(IBlockState var0, BlockPos var1, IBlockAccess var2, WorldRenderer var3);

    void renderBlockBrightness(IBlockState var0, float var1);

    void renderBlockDamage(IBlockState var0, BlockPos var1, TextureAtlasSprite var2, IBlockAccess var3);

}
