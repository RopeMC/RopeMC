package de.ropemc.api.wrapper.net.minecraft.client.entity;


import de.ropemc.api.wrapper.WrapperClass;

@WrapperClass("net.minecraft.client.entity.EntityPlayerSP")
public interface EntityPlayerSP
{
    String CLASSNAME = "net.minecraft.client.entity.EntityPlayerSP";

    void swingItem();

    void respawnPlayer();

    void sendChatMessage(String message);

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
     * Doesnt even Exist
     */
    //void printChatMessage(String message);
}
