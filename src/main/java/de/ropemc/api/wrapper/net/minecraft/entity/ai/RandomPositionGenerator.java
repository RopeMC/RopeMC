package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.net.minecraft.entity.EntityCreature;
import de.ropemc.api.wrapper.net.minecraft.util.Vec3;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.RandomPositionGenerator")
public interface RandomPositionGenerator {

    Vec3 findRandomTarget(EntityCreature var0, int var1, int var2);

    Vec3 findRandomTargetBlock(EntityCreature var0, int var1, int var2, Vec3 var3);

    Vec3 findRandomTargetBlockAwayFrom(EntityCreature var0, int var1, int var2, Vec3 var3);

    Vec3 findRandomTargetBlockTowards(EntityCreature var0, int var1, int var2, Vec3 var3);

}
