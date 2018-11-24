package de.ropemc.api.wrapper.net.minecraft.client.renderer.block.statemap;

import java.util.Map;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.block.statemap.BlockStateMapper")
public interface BlockStateMapper {

    Map putAllStateModelLocations();

    void registerBlockStateMapper(Block var0, IStateMapper var1);

    void registerBuiltInBlocks(Block[] var0);

}
