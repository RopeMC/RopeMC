package de.ropemc.api.wrapper.net.minecraft.command;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.command.CommandStats")
public interface CommandStats {

    List addTabCompletionOptions(ICommandSender var0, String[] var1, BlockPos var2);

    String[] func_175776_d();

    List func_175777_e();

    String getCommandName();

    String getCommandUsage(ICommandSender var0);

    int getRequiredPermissionLevel();

    boolean isUsernameIndex(String[] var0, int var1);

    void processCommand(ICommandSender var0, String[] var1);

}
