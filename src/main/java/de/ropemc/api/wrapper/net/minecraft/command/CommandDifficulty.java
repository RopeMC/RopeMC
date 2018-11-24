package de.ropemc.api.wrapper.net.minecraft.command;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.world.EnumDifficulty;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.command.CommandDifficulty")
public interface CommandDifficulty {

    List addTabCompletionOptions(ICommandSender var0, String[] var1, BlockPos var2);

    String getCommandName();

    String getCommandUsage(ICommandSender var0);

    EnumDifficulty getDifficultyFromCommand(String var0);

    int getRequiredPermissionLevel();

    void processCommand(ICommandSender var0, String[] var1);

}
