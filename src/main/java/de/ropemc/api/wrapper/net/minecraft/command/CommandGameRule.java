package de.ropemc.api.wrapper.net.minecraft.command;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.world.GameRules;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.command.CommandGameRule")
public interface CommandGameRule {

    List addTabCompletionOptions(ICommandSender var0, String[] var1, BlockPos var2);

    void func_175773_a(GameRules var0, String var1);

    String getCommandName();

    String getCommandUsage(ICommandSender var0);

    GameRules getGameRules();

    int getRequiredPermissionLevel();

    void processCommand(ICommandSender var0, String[] var1);

}
