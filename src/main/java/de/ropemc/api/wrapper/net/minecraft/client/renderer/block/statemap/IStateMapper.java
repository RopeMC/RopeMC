package de.ropemc.api.wrapper.net.minecraft.client.renderer.block.statemap;

import de.ropemc.api.wrapper.net.minecraft.block.Block;
import java.util.Map;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.block.statemap.IStateMapper")
public interface IStateMapper {

    Map putStateModelLocations(Block var0);

}
