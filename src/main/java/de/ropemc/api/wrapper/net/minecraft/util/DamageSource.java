package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.net.minecraft.entity.projectile.EntityArrow;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.entity.projectile.EntityFireball;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.world.Explosion;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.DamageSource")
public interface DamageSource {

    boolean canHarmInCreative();

    DamageSource causeArrowDamage(EntityArrow var0, Entity var1);

    DamageSource causeFireballDamage(EntityFireball var0, Entity var1);

    DamageSource causeIndirectMagicDamage(Entity var0, Entity var1);

    DamageSource causeMobDamage(EntityLivingBase var0);

    DamageSource causePlayerDamage(EntityPlayer var0);

    DamageSource causeThornsDamage(Entity var0);

    DamageSource causeThrownDamage(Entity var0, Entity var1);

    String getDamageType();

    IChatComponent getDeathMessage(EntityLivingBase var0);

    Entity getEntity();

    float getHungerDamage();

    Entity getSourceOfDamage();

    boolean isCreativePlayer();

    boolean isDamageAbsolute();

    boolean isDifficultyScaled();

    boolean isExplosion();

    boolean isFireDamage();

    boolean isMagicDamage();

    boolean isProjectile();

    boolean isUnblockable();

    DamageSource setDamageAllowedInCreativeMode();

    DamageSource setDamageBypassesArmor();

    DamageSource setDamageIsAbsolute();

    DamageSource setDifficultyScaled();

    DamageSource setExplosion();

    DamageSource setExplosionSource(Explosion var0);

    DamageSource setFireDamage();

    DamageSource setMagicDamage();

    DamageSource setProjectile();

}
