package de.ropemc.api.wrapper.net.minecraft.client.renderer;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.DestroyBlockProgress")
public interface DestroyBlockProgress {

    int getCreationCloudUpdateTick();

    int getPartialBlockDamage();

    BlockPos getPosition();

    void setCloudUpdateTick(int var0);

    void setPartialBlockDamage(int var0);

}
