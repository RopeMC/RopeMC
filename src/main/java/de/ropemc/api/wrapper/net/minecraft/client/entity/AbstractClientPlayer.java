package de.ropemc.api.wrapper.net.minecraft.client.entity;

import de.ropemc.api.wrapper.WrappedClass;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;

@WrappedClass("net.minecraft.client.entity.AbstractClientPlayer")
public interface AbstractClientPlayer extends EntityPlayer
{
    /**
     * Checks if this instance of AbstractClientPlayer has any associated player data.
     */
    boolean hasPlayerInfo();

    boolean hasSkin();

    String getSkinType();

    float getFovModifier();
}
