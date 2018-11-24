package de.ropemc.api.wrapper.net.minecraft.command;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.command.CommandReplaceItem")
public interface CommandReplaceItem {

    List addTabCompletionOptions(ICommandSender var0, String[] var1, BlockPos var2);

    String getCommandName();

    String getCommandUsage(ICommandSender var0);

    int getRequiredPermissionLevel();

    int getSlotForShortcut(String var0);

    String[] getUsernames();

    boolean isUsernameIndex(String[] var0, int var1);

    void processCommand(ICommandSender var0, String[] var1);

}
