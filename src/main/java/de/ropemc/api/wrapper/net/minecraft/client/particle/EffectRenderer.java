package de.ropemc.api.wrapper.net.minecraft.client.particle;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.EnumParticleTypes;
import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.particle.EffectRenderer")
public interface EffectRenderer {

    void addBlockDestroyEffects(BlockPos var0, IBlockState var1);

    void addBlockHitEffects(BlockPos var0, EnumFacing var1);

    void addEffect(EntityFX var0);

    void clearEffects(World var0);

    void emitParticleAtEntity(Entity var0, EnumParticleTypes var1);

    String getStatistics();

    void moveToAlphaLayer(EntityFX var0);

    void moveToLayer(EntityFX var0, int var1, int var2);

    void moveToNoAlphaLayer(EntityFX var0);

    void registerParticle(int var0, IParticleFactory var1);

    void registerVanillaParticles();

    void renderLitParticles(Entity var0, float var1);

    void renderParticles(Entity var0, float var1);

    EntityFX spawnEffectParticle(int var0, double var1, double var2, double var3, double var4, double var5, double var6, int[] var7);

    void tickParticle(EntityFX var0);

    void updateEffectAlphaLayer(List var0);

    void updateEffectLayer(int var0);

    void updateEffects();

}
