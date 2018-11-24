package de.ropemc.api.wrapper.net.minecraft.command;

import java.util.Map;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.command.ICommandManager")
public interface ICommandManager {

    int executeCommand(ICommandSender var0, String var1);

    Map getCommands();

    List getPossibleCommands(ICommandSender var0);

    List getTabCompletionOptions(ICommandSender var0, String var1, BlockPos var2);

}
