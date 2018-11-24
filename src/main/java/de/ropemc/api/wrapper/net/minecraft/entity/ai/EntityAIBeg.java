package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAIBeg")
public interface EntityAIBeg {

    boolean continueExecuting();

    boolean hasPlayerGotBoneInHand(EntityPlayer var0);

    void resetTask();

    boolean shouldExecute();

    void startExecuting();

    void updateTask();

}
