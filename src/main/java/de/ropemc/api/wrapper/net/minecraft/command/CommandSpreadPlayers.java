package de.ropemc.api.wrapper.net.minecraft.command;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import java.util.Random;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.command.CommandSpreadPlayers")
public interface CommandSpreadPlayers {

    List addTabCompletionOptions(ICommandSender var0, String[] var1, BlockPos var2);

    int func_110667_a(List var0);

    //int func_110668_a(CommandSpreadPlayers$Position var0, double var1, World var2, Random var3, double var4, double var5, double var6, double var7, CommandSpreadPlayers$Position[] var8, boolean var9);

    //void func_110669_a(ICommandSender var0, List var1, CommandSpreadPlayers$Position var2, double var3, double var4, World var5, boolean var6);

    //CommandSpreadPlayers$Position[] func_110670_a(Random var0, int var1, double var2, double var3, double var4, double var5);

    //double func_110671_a(List var0, World var1, CommandSpreadPlayers$Position[] var2, boolean var3);

    String getCommandName();

    String getCommandUsage(ICommandSender var0);

    int getRequiredPermissionLevel();

    void processCommand(ICommandSender var0, String[] var1);

}
