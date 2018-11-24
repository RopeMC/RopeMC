package de.ropemc.api.wrapper.net.minecraft.entity.monster;

import de.ropemc.api.wrapper.net.minecraft.entity.EnumCreatureAttribute;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.pathfinding.PathNavigate;
import de.ropemc.api.wrapper.net.minecraft.potion.PotionEffect;
import de.ropemc.api.wrapper.net.minecraft.world.DifficultyInstance;
import de.ropemc.api.wrapper.net.minecraft.entity.IEntityLivingData;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.monster.EntitySpider")
public interface EntitySpider {

    void applyEntityAttributes();

    void dropFewItems(boolean var0, int var1);

    void entityInit();

    EnumCreatureAttribute getCreatureAttribute();

    String getDeathSound();

    Item getDropItem();

    float getEyeHeight();

    String getHurtSound();

    String getLivingSound();

    double getMountedYOffset();

    PathNavigate getNewNavigator(World var0);

    boolean isBesideClimbableBlock();

    boolean isOnLadder();

    boolean isPotionApplicable(PotionEffect var0);

    IEntityLivingData onInitialSpawn(DifficultyInstance var0, IEntityLivingData var1);

    void onUpdate();

    void playStepSound(BlockPos var0, Block var1);

    void setBesideClimbableBlock(boolean var0);

    void setInWeb();

}
