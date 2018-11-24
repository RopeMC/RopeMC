package de.ropemc.api.wrapper.net.minecraft.command.server;

import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
//import io.netty.buffer.ByteBuf;
import de.ropemc.api.wrapper.net.minecraft.command.CommandResultStats;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
//import de.ropemc.api.wrapper.net.minecraft.command.CommandResultStats$Type;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.command.server.CommandBlockLogic")
public interface CommandBlockLogic {

    void addChatMessage(IChatComponent var0);

    boolean canCommandSenderUseCommand(int var0, String var1);

    int func_145751_f();

    //void func_145757_a(ByteBuf var0);

    String getCommand();

    CommandResultStats getCommandResultStats();

    IChatComponent getDisplayName();

    IChatComponent getLastOutput();

    String getName();

    int getSuccessCount();

    void readDataFromNBT(NBTTagCompound var0);

    boolean sendCommandFeedback();

    void setCommand(String var0);

    //void setCommandStat(CommandResultStats$Type var0, int var1);

    void setLastOutput(IChatComponent var0);

    void setName(String var0);

    void setTrackOutput(boolean var0);

    boolean shouldTrackOutput();

    void trigger(World var0);

    boolean tryOpenEditCommandBlock(EntityPlayer var0);

    void updateCommand();

    void writeDataToNBT(NBTTagCompound var0);

}
