package de.ropemc.api.wrapper.net.minecraft.client.renderer.block.statemap;

import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.client.resources.model.ModelResourceLocation;
import java.util.Map;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.block.statemap.StateMapperBase")
public interface StateMapperBase {

    ModelResourceLocation getModelResourceLocation(IBlockState var0);

    String getPropertyString(Map var0);

    Map putStateModelLocations(Block var0);

}
