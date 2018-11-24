package de.ropemc.api.wrapper.net.minecraft.command;

import java.util.Map;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayerMP;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.command.PlayerSelector")
public interface PlayerSelector {

    List filterResults(Map var0, Class var1, List var2, String var3, World var4, BlockPos var5);

    List func_179647_f(Map var0);

    List func_179648_b(Map var0);

    List func_179649_c(Map var0);

    int func_179650_a(int var0);

    String func_179651_b(Map var0, String var1);

    List func_179657_e(Map var0);

    List func_179658_a(List var0, Map var1, ICommandSender var2, Class var3, String var4, BlockPos var5);

    List func_179659_d(Map var0);

    AxisAlignedBB func_179661_a(BlockPos var0, int var1, int var2, int var3);

    List func_179662_g(Map var0);

    List func_179663_a(Map var0, String var1);

    BlockPos func_179664_b(Map var0, BlockPos var1);

    boolean func_179665_h(Map var0);

    List func_180698_a(Map var0, BlockPos var1);

    Map func_96560_a(Map var0);

    Map getArgumentMap(String var0);

    List getWorlds(ICommandSender var0, Map var1);

    boolean hasArguments(String var0);

    boolean isEntityTypeValid(ICommandSender var0, Map var1);

    List matchEntities(ICommandSender var0, String var1, Class var2);

    IChatComponent matchEntitiesToChatComponent(ICommandSender var0, String var1);

    Entity matchOneEntity(ICommandSender var0, String var1, Class var2);

    EntityPlayerMP matchOnePlayer(ICommandSender var0, String var1);

    boolean matchesMultiplePlayers(String var0);

    int parseIntWithDefault(Map var0, String var1, int var2);

}
