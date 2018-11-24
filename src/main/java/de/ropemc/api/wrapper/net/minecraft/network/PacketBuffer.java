package de.ropemc.api.wrapper.net.minecraft.network;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import java.util.UUID;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.PacketBuffer")
public interface PacketBuffer {

    int getVarIntSize(int var0);

    BlockPos readBlockPos();

    byte[] readByteArray();

    IChatComponent readChatComponent();

    Enum readEnumValue(Class var0);

    ItemStack readItemStackFromBuffer();

    NBTTagCompound readNBTTagCompoundFromBuffer();

    String readStringFromBuffer(int var0);

    UUID readUuid();

    int readVarIntFromBuffer();

    long readVarLong();

    void writeBlockPos(BlockPos var0);

    void writeByteArray(byte[] var0);

    void writeChatComponent(IChatComponent var0);

    void writeEnumValue(Enum var0);

    void writeItemStackToBuffer(ItemStack var0);

    void writeNBTTagCompoundToBuffer(NBTTagCompound var0);

    PacketBuffer writeString(String var0);

    void writeUuid(UUID var0);

    void writeVarIntToBuffer(int var0);

    void writeVarLong(long var0);

}
