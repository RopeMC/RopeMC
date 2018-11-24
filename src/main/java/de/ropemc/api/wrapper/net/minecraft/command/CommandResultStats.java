package de.ropemc.api.wrapper.net.minecraft.command;

import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.command.CommandResultStats")
public interface CommandResultStats {

    //void func_179667_a(CommandResultStats var0, CommandResultStats$Type var1, String var2, String var3);

    //void func_179669_a(CommandResultStats var0, CommandResultStats$Type var1);

    void func_179671_a(CommandResultStats var0);

    //void func_179672_a(ICommandSender var0, CommandResultStats$Type var1, int var2);

    void readStatsFromNBT(NBTTagCompound var0);

    void writeStatsToNBT(NBTTagCompound var0);

}
