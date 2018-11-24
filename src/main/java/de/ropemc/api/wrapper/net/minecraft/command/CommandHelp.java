package de.ropemc.api.wrapper.net.minecraft.command;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import java.util.List;
import java.util.Map;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.command.CommandHelp")
public interface CommandHelp {

    List addTabCompletionOptions(ICommandSender var0, String[] var1, BlockPos var2);

    List getCommandAliases();

    String getCommandName();

    String getCommandUsage(ICommandSender var0);

    Map getCommands();

    int getRequiredPermissionLevel();

    List getSortedPossibleCommands(ICommandSender var0);

    void processCommand(ICommandSender var0, String[] var1);

}
