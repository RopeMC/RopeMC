package de.ropemc.api.wrapper.net.minecraft.client.entity;

import de.ropemc.utils.Vector3d;
import de.ropemc.utils.wrapper.RootClass;
import de.ropemc.utils.wrapper.WrapperClass;

@WrapperClass
@RootClass("net.minecraft.client.entity.EntityPlayerSP")
public interface EntityPlayerSP
{
    String CLASSNAME = "net.minecraft.client.entity.EntityPlayerSP";

    void swingItem();

    void respawnPlayer();

    void sendChatMessage(String message);

    /**
     * @return hurttime of the own chat
     */
    int getHurtTime();

    /**
     * @return motion of the own chat as a three dimensional double-vector
     */
    Vector3d getMotion();

    /**
     * @return position of the own chat as a three dimensional double-vector
     */
    Vector3d getPosition();

    /**
     * sets the motion of the own chat
     *
     * @param motion three dimensional double-vector which represents the motion
     */
    //void setMotion(Vector3d motion);

    /**
     * @return if the own chat is sprinting
     */
    boolean isSprinting();

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
    void setSneaking(boolean flag);

    /**
     * @return if the own chat is invisible
     */
    boolean isInvisible();

    void printChatMessage(String message);
}
