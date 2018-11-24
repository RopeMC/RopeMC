package de.ropemc.api.wrapper.net.minecraft.client.renderer;

import de.ropemc.api.wrapper.net.minecraft.client.renderer.block.statemap.BlockStateMapper;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.client.resources.model.IBakedModel;
import de.ropemc.api.wrapper.net.minecraft.client.resources.model.ModelManager;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.texture.TextureAtlasSprite;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.block.statemap.IStateMapper;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.BlockModelShapes")
public interface BlockModelShapes {

    BlockStateMapper getBlockStateMapper();

    IBakedModel getModelForState(IBlockState var0);

    ModelManager getModelManager();

    TextureAtlasSprite getTexture(IBlockState var0);

    void registerAllBlocks();

    void registerBlockWithStateMapper(Block var0, IStateMapper var1);

    void registerBuiltInBlocks(Block[] var0);

    void reloadModels();

}
