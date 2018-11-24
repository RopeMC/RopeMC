package de.ropemc.api.wrapper.net.minecraft.network.rcon;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.rcon.RConOutputStream")
public interface RConOutputStream {

    void reset();

    byte[] toByteArray();

    void writeByteArray(byte[] var0);

    void writeInt(int var0);

    void writeShort(short var0);

    void writeString(String var0);

}
