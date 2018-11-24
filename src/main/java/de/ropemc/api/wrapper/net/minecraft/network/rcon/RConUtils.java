package de.ropemc.api.wrapper.net.minecraft.network.rcon;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.rcon.RConUtils")
public interface RConUtils {

    String getByteAsHexString(byte var0);

    int getBytesAsBEint(byte[] var0, int var1, int var2);

    int getBytesAsLEInt(byte[] var0, int var1, int var2);

    String getBytesAsString(byte[] var0, int var1, int var2);

    int getRemainingBytesAsLEInt(byte[] var0, int var1);

}
