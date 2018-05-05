package de.ropemc.api.wrapper.net.minecraft.entity;


public interface Entity
{
    String CLASSNAME = "net.minecraft.entity.Entity";

    int getEntityId();

    void setEntityId(int id);

    /**
     * Keeps moving the entity up so it isn't colliding with blocks and other requirements for this entity to be spawned
     * (only actually used on players though its also on Entity)
     */
    void preparePlayerToSpawn();

    /**
     * Will get destroyed next tick.
     */
    void setDead();

    /**
     * Sets the width and height of the entity. Args: width, height
     */
    void setSize(float width, float height);

    /**
     * Sets the rotation of the entity. Args: yaw, pitch (both in degrees)
     */
    void setRotation(float yaw, float pitch);

    /**
     * Sets the x,y,z of the entity from the given parameters. Also seems to set up a bounding box.
     */
    void setPosition(double x, double y, double z);

    /**
     * Adds 15% to the entity's yaw and subtracts 15% from the pitch. Clamps pitch from -90 to 90. Both arguments in
     * degrees.
     */
    void setAngles(float yaw, float pitch);

    /**
     * Return the amount of time this entity should stay in a portal before being transported.
     */
    int getMaxInPortalTime();

    /**
     * Called whenever the entity is walking inside of lava.
     */
    void setOnFireFromLava();

    /**
     * Sets entity to burn for x amount of seconds, cannot lower amount of existing fire.
     */
    void setFire(int seconds);

    /**
     * Removes fire from entity.
     */
    void extinguish();

    /**
     * sets the dead flag. Used when you fall off the bottom of the world.
     */
    void kill();

    /**
     * Checks if the offset position from the entity's current position is inside of liquid. Args: x, y, z
     */
    boolean isOffsetPositionInLiquid(double x, double y, double z);

    /**
     * Tries to moves the entity by the passed in displacement. Args: x, y, z
     */
    void moveEntity(double x, double y, double z);

    /**
     * Resets the entity's position to the center (planar) and bottom (vertical) points of its bounding box.
     */
    void resetPositionToBB();

    String getSwimSound();

    void playSound(String name, float volume, float pitch);

    /**
     * @return True if this entity will not play sounds
     */
    boolean isSilent();

    /**
     * When set to true the entity will not play sounds.
     */
    void setSilent(boolean isSilent);

    /**
     * returns if this entity triggers Block.onEntityWalking on the blocks they walk on. used for spiders and wolves to
     * prevent them from trampling crops
     */
    boolean canTriggerWalking();

    /**
     * Will deal the specified amount of damage to the entity if the entity isn't immune to fire damage. Args:
     * amountDamage
     */
    void dealFireDamage(int amount);

    boolean isImmuneToFire();

    void fall(float distance, float damageMultiplier);

    /**
     * Checks if this entity is either in water or on an open air block in rain (used in wolves).
     */
    boolean isWet();

    /**
     * Checks if this entity is inside water (if inWater field is true as a result of handleWaterMovement() returning
     * true)
     */
    boolean isInWater();

    /**
     * sets the players height back to normal after doing things like sleeping and dieing
     */
    void resetHeight();

    /**
     * Attempts to create sprinting particles if the entity is sprinting and not in water.
     */
    void spawnRunningParticles();

    void createRunningParticles();

    String getSplashSound();

    boolean isInLava();

    /**
     * Used in both water and by flying objects
     */
    void moveFlying(float strafe, float forward, float friction);

    int getBrightnessForRender(float partialTicks);

    /**
     * Gets how bright this entity is.
     */
    float getBrightness(float partialTicks);

    /**
     * Sets the entity's position and rotation.
     */
    void setPositionAndRotation(double x, double y, double z, float yaw, float pitch);

    /**
     * Sets the location and Yaw/Pitch of an entity in the world
     */
    void setLocationAndAngles(double x, double y, double z, float yaw, float pitch);

    /**
     * Gets the squared distance to the position. Args: x, y, z
     */
    double getDistanceSq(double x, double y, double z);

    /**
     * Gets the distance to the position. Args: x, y, z
     */
    double getDistance(double x, double y, double z);

    /**
     * Adds to the current velocity of the entity. Args: x, y, z
     */
    void addVelocity(double x, double y, double z);

    /**
     * Sets that this entity has been attacked.
     */
    void setBeenAttacked();

    /**
     * Returns true if other Entities should be prevented from moving through this Entity.
     */
    boolean canBeCollidedWith();

    /**
     * Returns true if this entity should push and be pushed by other entities when colliding.
     */
    boolean canBePushed();

    boolean isInRangeToRender3d(double x, double y, double z);

    /**
     * Checks if the entity is in range to render by using the past in distance and comparing it to its average edge
     * length * 64 * renderDistanceWeight Args: distance
     */
    boolean isInRangeToRenderDist(double distance);

    /**
     * Returns the string that identifies this Entity's class
     */
    String getEntityString();

    /**
     * Checks whether target entity is alive.
     */
    boolean isEntityAlive();

    /**
     * Checks if this entity is inside of an opaque block
     */
    boolean isEntityInsideOpaqueBlock();

    /**
     * Returns the Y Offset of this entity.
     */
    double getYOffset();

    /**
     * Returns the Y offset from the entity's position for any entity riding this one.
     */
    double getMountedYOffset();

    float getCollisionBorderSize();

    /**
     * Return the amount of cooldown before this entity can use a portal again.
     */
    int getPortalCooldown();

    /**
     * Sets the velocity to the args. Args: x, y, z
     */
    void setVelocity(double x, double y, double z);

    /**
     * Returns true if the entity is on fire. Used by render to add the fire effect on rendering.
     */
    boolean isBurning();

    /**
     * Returns true if the entity is riding another entity, used by render to rotate the legs to be in 'sit' position
     * for players.
     */
    boolean isRiding();

    /**
     * Returns if this entity is sneaking.
     */
    boolean isSneaking();

    /**
     * Sets the sneaking flag.
     */
    void setSneaking(boolean flag);

    boolean isSprinting();

    /**
     * Set sprinting switch for Entity.
     */
    void setSprinting(boolean flag);

    boolean isInvisible();

    void setInvisible(boolean flag);

    boolean isEating();

    void setEating(boolean flag);

    /**
     * Returns true if the flag is active for the entity. Known flags: 0) is burning; 1) is sneaking; 2) is riding
     * something; 3) is sprinting; 4) is eating
     */
    boolean getFlag(int flag);

    void setFlag(int flag, boolean set);

    int getAir();

    void setAir(int air);

    /**
     * Sets the Entity inside a web block.
     */
    void setInWeb();

    float getRotationYawHead();

    /**
     * Sets the head's yaw rotation of the entity.
     */
    void setRotationYawHead(float rotation);

    /**
     * If returns false, the item will not inflict any damage against entities.
     */
    boolean canAttackWithItem();

    /**
     * Teleports the entity to another dimension. Params: Dimension number to teleport to
     */
    void travelToDimension(int dimensionId);

    /**
     * The maximum height from where the entity is alowed to jump (used in pathfinder)
     */
    int getMaxFallHeight();

    /**
     * Return whether this entity should NOT trigger a pressure plate or a tripwire.
     */
    boolean doesEntityNotTriggerPressurePlate();

    /**
     * Return whether this entity should be rendered as on fire.
     */
    boolean canRenderOnFire();

    boolean isPushedByWater();

    /**
     * Sets the custom name tag for this entity
     */
    void setCustomNameTag(String name);

    String getCustomNameTag();

    /**
     * Returns true if this thing is named
     */
    boolean hasCustomName();

    void setAlwaysRenderNameTag(boolean alwaysRenderNameTag);

    boolean getAlwaysRenderNameTag();

    /**
     * Sets the position of the entity and updates the 'last' variables
     */
    void setPositionAndUpdate(double x, double y, double z);

    boolean getAlwaysRenderNameTagForRender();

    float getEyeHeight();

    boolean isOutsideBorder();

    void setOutsideBorder(boolean outsideBorder);

    boolean isImmuneToExplosions();
}
