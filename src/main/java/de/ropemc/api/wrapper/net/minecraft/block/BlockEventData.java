package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockEventData")
public interface BlockEventData {

    Block getBlock();

    int getEventID();

    int getEventParameter();

    BlockPos getPosition();

}
