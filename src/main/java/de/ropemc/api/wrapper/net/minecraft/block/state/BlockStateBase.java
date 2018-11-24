package de.ropemc.api.wrapper.net.minecraft.block.state;

import de.ropemc.api.wrapper.net.minecraft.block.properties.IProperty;
import java.util.Collection;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.state.BlockStateBase")
public interface BlockStateBase {

    IBlockState cycleProperty(IProperty var0);

    Object cyclePropertyValue(Collection var0, Object var1);

}
