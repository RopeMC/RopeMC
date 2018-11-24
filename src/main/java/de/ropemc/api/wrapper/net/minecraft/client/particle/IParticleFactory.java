package de.ropemc.api.wrapper.net.minecraft.client.particle;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.particle.IParticleFactory")
public interface IParticleFactory {

    EntityFX getEntityFX(int var0, World var1, double var2, double var3, double var4, double var5, double var6, double var7, int[] var8);

}
