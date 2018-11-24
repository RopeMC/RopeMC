package de.ropemc.api.wrapper.net.minecraft.command;

import java.util.Map;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.command.CommandHandler")
public interface CommandHandler {

    String[] dropFirstString(String[] var0);

    int executeCommand(ICommandSender var0, String var1);

    Map getCommands();

    List getPossibleCommands(ICommandSender var0);

    List getTabCompletionOptions(ICommandSender var0, String var1, BlockPos var2);

    int getUsernameIndex(ICommand var0, String[] var1);

    ICommand registerCommand(ICommand var0);

    boolean tryExecute(ICommandSender var0, String[] var1, ICommand var2, String var3);

}
