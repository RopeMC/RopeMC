package de.ropemc.api.wrapper.net.minecraft.client.renderer;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.util.Vec3;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.ActiveRenderInfo")
public interface ActiveRenderInfo {

    Block getBlockAtEntityViewpoint(World var0, Entity var1, float var2);

    Vec3 getPosition();

    float getRotationX();

    float getRotationXY();

    float getRotationXZ();

    float getRotationYZ();

    float getRotationZ();

    Vec3 projectViewFromEntity(Entity var0, double var1);

    void updateRenderInfo(EntityPlayer var0, boolean var1);

}
