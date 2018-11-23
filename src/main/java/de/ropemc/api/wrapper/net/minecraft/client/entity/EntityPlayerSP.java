package de.ropemc.api.wrapper.net.minecraft.client.entity;


import de.ropemc.api.wrapper.WrappedClass;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;

@WrappedClass("net.minecraft.client.entity.EntityPlayerSP")
public interface EntityPlayerSP extends AbstractClientPlayer {
    String CLASSNAME = "net.minecraft.client.entity.EntityPlayerSP";

    void swingItem();

    void respawnPlayer();

    /**
     * Sends a chat message from the player. Args: chatMessage
     */
    void sendChatMessage(String message);

    void closeScreenAndDropStack();

    void sendHorseJump();

    void sendHorseInventory();

    void setClientBrand(String brand);

    String getClientBrand();

    void setXPStats(float currentXP, int maxXP, int level);

    /**
     * Updates health locally.
     *
     * @param health the health
     */
    void setPlayerSPHealth(float health);

    boolean isRidingHorse();

    float getHorseJumpPower();

    boolean isCurrentViewEntity();

    /**
     * @return motion of the own chat as a three dimensional double-vector
     */
    //Vector3d getMotion();

    /**
     * @return position of the own chat as a three dimensional double-vector
     */
    //Vector3d getPosition();

    /**
     * sets the motion of the own chat
     *
     * @param motion three dimensional double-vector which represents the motion
     */
    //void setMotion(Vector3d motion);

    /**
     * @return if the own chat is sprinting
     */
    //boolean isSprinting();

    /**
     * sets the own chat's sprinting state
     *
     * @param flag sprinting state
     */
    void setSprinting(boolean flag);

    /**
     * @return if the own chat is sneaking
     */
    boolean isSneaking();

    /**
     * sets the own chat's sneaking state
     *
     * @param flag sneaking state
     */
    //void setSneaking(boolean flag);

    /**
     * @return if the own chat is invisible
     */
    //boolean isInvisible();

    /**
     * Returns true if the block at the given BlockPos and the block above it are NOT full cubes.
     */
    boolean isOpenBlockSpace(BlockPos pos);
}
