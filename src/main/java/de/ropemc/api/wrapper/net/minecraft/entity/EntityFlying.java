package de.ropemc.api.wrapper.net.minecraft.entity;

import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.EntityFlying")
public interface EntityFlying {

    void fall(float var0, float var1);

    boolean isOnLadder();

    void moveEntityWithHeading(float var0, float var1);

    void updateFallState(double var0, boolean var1, Block var2, BlockPos var3);

}
