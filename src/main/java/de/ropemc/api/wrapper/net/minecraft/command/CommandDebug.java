package de.ropemc.api.wrapper.net.minecraft.command;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.command.CommandDebug")
public interface CommandDebug {

    List addTabCompletionOptions(ICommandSender var0, String[] var1, BlockPos var2);

    void func_147202_a(int var0, String var1, StringBuilder var2);

    String getCommandName();

    String getCommandUsage(ICommandSender var0);

    String getProfileResults(long var0, int var1);

    int getRequiredPermissionLevel();

    String getWittyComment();

    void processCommand(ICommandSender var0, String[] var1);

    void saveProfileResults(long var0, int var1);

}
