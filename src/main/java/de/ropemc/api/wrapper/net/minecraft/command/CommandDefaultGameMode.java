package de.ropemc.api.wrapper.net.minecraft.command;

//import de.ropemc.api.wrapper.net.minecraft.world.WorldSettings$GameType;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.command.CommandDefaultGameMode")
public interface CommandDefaultGameMode {

    String getCommandName();

    String getCommandUsage(ICommandSender var0);

    void processCommand(ICommandSender var0, String[] var1);

    //void setGameType(WorldSettings$GameType var0);

}
