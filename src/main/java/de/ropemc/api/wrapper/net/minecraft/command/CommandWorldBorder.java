package de.ropemc.api.wrapper.net.minecraft.command;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.world.border.WorldBorder;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.command.CommandWorldBorder")
public interface CommandWorldBorder {

    List addTabCompletionOptions(ICommandSender var0, String[] var1, BlockPos var2);

    String getCommandName();

    String getCommandUsage(ICommandSender var0);

    int getRequiredPermissionLevel();

    WorldBorder getWorldBorder();

    void processCommand(ICommandSender var0, String[] var1);

}
