package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.net.minecraft.village.VillageDoorInfo;
import de.ropemc.api.wrapper.net.minecraft.village.Village;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityAIMoveThroughVillage")
public interface EntityAIMoveThroughVillage {

    boolean continueExecuting();

    boolean doesDoorListContain(VillageDoorInfo var0);

    VillageDoorInfo findNearestDoor(Village var0);

    void resetTask();

    void resizeDoorList();

    boolean shouldExecute();

    void startExecuting();

}
