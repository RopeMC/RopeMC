package de.ropemc.api.wrapper.net.minecraft.command;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.command.CommandTime")
public interface CommandTime {

    List addTabCompletionOptions(ICommandSender var0, String[] var1, BlockPos var2);

    void addTime(ICommandSender var0, int var1);

    String getCommandName();

    String getCommandUsage(ICommandSender var0);

    int getRequiredPermissionLevel();

    void processCommand(ICommandSender var0, String[] var1);

    void setTime(ICommandSender var0, int var1);

}
