package de.ropemc.api.wrapper.net.minecraft.entity;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.EntityLivingBase")
public interface EntityLivingBase extends Entity
{
    String CLASSNAME = "net.minecraft.entity.EntityLivingBase";

    boolean canBreatheUnderwater();

    /**
     * If Animal, checks if the age timer is negative
     */
    boolean isChild();

    /**
     * Entity won't drop items or experience points if this returns false
     */
    boolean canDropLoot();

    /**
     * Decrements the entity's air supply when underwater
     */
    int decreaseAirSupply(int p_70682_1_);

    /**
     * Only use is to identify if class is an instance of player for experience dropping
     */
    boolean isPlayer();

    int getRevengeTimer();

    int getLastAttackerTime();

    int getAge();

    void updatePotionEffects();

    /**
     * Clears potion metadata values if the entity has no potion effects. Otherwise, updates potion effect color,
     * ambience, and invisibility metadata values
     */
    void updatePotionMetadata();

    /**
     * Resets the potion effect color and ambience metadata values
     */
    void resetPotionEffectMetadata();

    void clearActivePotions();

    boolean isPotionActive(int potionId);

    /**
     * Returns true if this entity is undead.
     */
    boolean isEntityUndead();

    /**
     * Remove the speified potion effect from this entity.
     */
    void removePotionEffectClient(int potionId);

    /**
     * Remove the specified potion effect from this entity.
     */
    void removePotionEffect(int potionId);

    /**
     * Heal living entity (param: amount of half-hearts)
     */
    void heal(float healAmount);

    float getHealth();

    void setHealth(float health);

    /**
     * Drop the equipment for this entity.
     */
    void dropEquipment(boolean p_82160_1_, int p_82160_2_);

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    String getHurtSound();

    /**
     * Returns the sound this mob makes on death.
     */
    String getDeathSound();

    /**
     * Causes this Entity to drop a random item.
     */
    void addRandomDrop();

    /**
     * Drop 0-2 items of this living's type
     */
    void dropFewItems(boolean p_70628_1_, int p_70628_2_);

    /**
     * returns true if this entity is by a ladder, false otherwise
     */
    boolean isOnLadder();

    String getFallSoundString(int damageValue);

    /**
     * Returns the current armor value as determined by a call to InventoryPlayer.getTotalArmorValue
     */
    int getTotalArmorValue();

    void damageArmor(float p_70675_1_);

    float getMaxHealth();

    /**
     * counts the amount of arrows stuck in the entity. getting hit by arrows increases this, used in rendering
     */
    int getArrowCountInEntity();

    /**
     * sets the amount of arrows stuck in the entity. used for rendering those
     */
    void setArrowCountInEntity(int count);

    /**
     * Returns an integer indicating the end point of the swing animation, used by swingProgress to provide a
     * progress indicator. Takes dig speed enchantments into account.
     */
    int getArmSwingAnimationEnd();

    /**
     * Swings the item the player is holding.
     */
    void swingItem();

    /**
     * Returns the volume for the sounds this mob makes.
     */
    float getSoundVolume();

    /**
     * Gets the pitch of living sounds in living entities.
     */
    float getSoundPitch();

    /**
     * Dead and sleeping entities cannot move
     */
    boolean isMovementBlocked();

    float getJumpUpwardsMotion();

    void jump();

    void handleJumpLava();

    /**
     * Moves the entity based on the specified heading.  Args: strafe, forward
     */
    void moveEntityWithHeading(float strafe, float forward);

    /**
     * the movespeed used for the new AI system
     */
    float getAIMoveSpeed();

    /**
     * set the movespeed used for the new AI system
     */
    void setAIMoveSpeed(float speedIn);

    /**
     * Returns whether player is sleeping or not
     */
    boolean isPlayerSleeping();

    void setJumping(boolean p_70637_1_);

    /**
     * Returns where in the swing animation the living entity is (from 0 to 1).  Args: partialTickTime
     */
    float getSwingProgress(float partialTickTime);

    /**
     * Returns whether the entity is in a server world
     */
    boolean isServerWorld();

    float getAbsorptionAmount();

    void setAbsorptionAmount(float amount);

    void markPotionsDirty();
}
