package de.ropemc.api.wrapper.net.minecraft.entity.player;

import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.player.PlayerCapabilities")
public interface PlayerCapabilities {

    float getFlySpeed();

    float getWalkSpeed();

    void readCapabilitiesFromNBT(NBTTagCompound var0);

    void setFlySpeed(float var0);

    void setPlayerWalkSpeed(float var0);

    void writeCapabilitiesToNBT(NBTTagCompound var0);

}
