package de.ropemc.api.wrapper.net.minecraft.command;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayerMP;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import java.util.Collection;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.command.CommandBase")
public interface CommandBase {

    List addTabCompletionOptions(ICommandSender var0, String[] var1, BlockPos var2);

    String buildString(String[] var0, int var1);

    boolean canCommandSenderUseCommand(ICommandSender var0);

    int compareTo(ICommand var0);

    boolean doesStringStartWith(String var0, String var1);

    List func_175763_c(ICommandSender var0, String var1);

    Entity func_175768_b(ICommandSender var0, String var1);

    List func_175771_a(String[] var0, int var1, BlockPos var2);

    List func_181043_b(String[] var0, int var1, BlockPos var2);

    Block getBlockByText(ICommandSender var0, String var1);

    IChatComponent getChatComponentFromNthArg(ICommandSender var0, String[] var1, int var2);

    IChatComponent getChatComponentFromNthArg(ICommandSender var0, String[] var1, int var2, boolean var3);

    List getCommandAliases();

    EntityPlayerMP getCommandSenderAsPlayer(ICommandSender var0);

    Entity getEntity(ICommandSender var0, String var1, Class var2);

    String getEntityName(ICommandSender var0, String var1);

    Item getItemByText(ICommandSender var0, String var1);

    List getListOfStringsMatchingLastWord(String[] var0, Collection var1);

    List getListOfStringsMatchingLastWord(String[] var0, String[] var1);

    EntityPlayerMP getPlayer(ICommandSender var0, String var1);

    String getPlayerName(ICommandSender var0, String var1);

    int getRequiredPermissionLevel();

    boolean isUsernameIndex(String[] var0, int var1);

    IChatComponent join(List var0);

    String joinNiceString(Object[] var0);

    String joinNiceStringFromCollection(Collection var0);

    void notifyOperators(ICommandSender var0, ICommand var1, int var2, String var3, Object[] var4);

    void notifyOperators(ICommandSender var0, ICommand var1, String var2, Object[] var3);

    BlockPos parseBlockPos(ICommandSender var0, String[] var1, int var2, boolean var3);

    boolean parseBoolean(String var0);

    //CommandBase$CoordinateArg parseCoordinate(double var0, String var1, int var2, int var3, boolean var4);

    //CommandBase$CoordinateArg parseCoordinate(double var0, String var1, boolean var2);

    double parseDouble(double var0, String var1, int var2, int var3, boolean var4);

    double parseDouble(double var0, String var1, boolean var2);

    double parseDouble(String var0);

    double parseDouble(String var0, double var1);

    double parseDouble(String var0, double var1, double var2);

    int parseInt(String var0);

    int parseInt(String var0, int var1);

    int parseInt(String var0, int var1, int var2);

    long parseLong(String var0);

    long parseLong(String var0, long var1, long var2);

    void setAdminCommander(IAdminCommand var0);

}
