package de.ropemc.api.wrapper.net.minecraft.client.renderer.block.statemap;

import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.client.resources.model.ModelResourceLocation;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.block.statemap.DefaultStateMapper")
public interface DefaultStateMapper {

    ModelResourceLocation getModelResourceLocation(IBlockState var0);

}
