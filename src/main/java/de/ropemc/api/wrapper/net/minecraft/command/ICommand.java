package de.ropemc.api.wrapper.net.minecraft.command;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.command.ICommand")
public interface ICommand {

    List addTabCompletionOptions(ICommandSender var0, String[] var1, BlockPos var2);

    boolean canCommandSenderUseCommand(ICommandSender var0);

    List getCommandAliases();

    String getCommandName();

    String getCommandUsage(ICommandSender var0);

    boolean isUsernameIndex(String[] var0, int var1);

    void processCommand(ICommandSender var0, String[] var1);

}
