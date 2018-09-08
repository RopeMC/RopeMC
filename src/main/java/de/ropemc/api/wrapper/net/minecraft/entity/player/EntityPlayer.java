package de.ropemc.api.wrapper.net.minecraft.entity.player;

import de.ropemc.api.wrapper.WrappedClass;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;

@WrappedClass("net.minecraft.entity.player.EntityPlayer")
public interface EntityPlayer extends EntityLivingBase {
    String CLASSNAME = "net.minecraft.entity.player.EntityPlayer";

    /**
     * Returns the item in use count
     */
    int getItemInUseCount();

    /**
     * Checks if the entity is currently using an item (e.g., bow, food, sword) by holding down the useItemButton
     */
    boolean isUsingItem();

    /**
     * gets the duration for how long the current itemInUse has been in use
     */
    int getItemInUseDuration();

    void stopUsingItem();

    void clearItemInUse();

    boolean isBlocking();

    /**
     * When searching for vulnerable players, if a player is invisible, the return value of this is the chance of seeing
     * them anyway.
     */
    float getArmorVisibility();

    /**
     * Destroys the currently equipped item from the player's inventory.
     */
    void destroyCurrentEquippedItem();

    /**
     * Returns the Y Offset of this entity.
     */
    double getYOffset();

    /**
     * returns true if this is an EntityPlayerSP, or the logged in player.
     */
    boolean isUser();

    /**
     * Wake up the player if they're sleeping.
     */
    void wakeUpPlayer(boolean p_70999_1_, boolean updateWorldFlag, boolean setSpawn);

    boolean isInBed();

    /**
     * Returns the orientation of the bed in degrees.
     */
    float getBedOrientationInDegrees();

    /**
     * Returns whether or not the player is asleep and the screen has fully faded.
     */
    boolean isPlayerFullyAsleep();

    int getSleepTimer();

    boolean isSpawnForced();

    /**
     * Adds a value to a movement statistic field - like run, walk, swin or climb.
     */
    void addMovementStat(double p_71000_1_, double p_71000_3_, double p_71000_5_);

    /**
     * Adds a value to a mounted movement statistic field - by minecart, boat, or pig.
     */
    void addMountedMovementStat(double p_71015_1_, double p_71015_3_, double p_71015_5_);

    /**
     * Add experience points to player.
     */
    void addExperience(int amount);

    int getXPSeed();

    void removeExperienceLevel(int levels);

    /**
     * Add experience levels to this player.
     */
    void addExperienceLevel(int levels);

    /**
     * This method returns the cap amount of experience that the experience bar can hold. With each level, the
     * experience cap on the player's experience bar is raised by 10.
     */
    int xpBarCap();

    /**
     * increases exhaustion level by supplied amount
     */
    void addExhaustion(float p_71020_1_);

    boolean canEat(boolean ignoreHunger);

    boolean shouldHeal();

    boolean isAllowEdit();

    /**
     * Sends the player's abilities to the server (if there is one).
     */
    void sendPlayerAbilities();

    boolean isSpectator();

    /**
     * Whether the "reducedDebugInfo" option is active for this player.
     */
    boolean hasReducedDebug();

    void setReducedDebug(boolean reducedDebug);

    /**
     * returns the ItemStack containing the itemInUse
     */
    ItemStack getItemInUse();
}
