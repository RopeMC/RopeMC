package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockCarrot")
public interface BlockCarrot {

    Item getCrop();

    Item getSeed();

}
