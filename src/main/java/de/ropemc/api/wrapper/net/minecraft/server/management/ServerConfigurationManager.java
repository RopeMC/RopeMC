package de.ropemc.api.wrapper.net.minecraft.server.management;

//import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayerMP;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import java.util.UUID;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.stats.StatisticsFile;
//import de.ropemc.api.wrapper.net.minecraft.server.MinecraftServer;
import de.ropemc.api.wrapper.net.minecraft.network.NetworkManager;
import de.ropemc.api.wrapper.net.minecraft.world.WorldServer;
import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.net.minecraft.network.Packet;
import de.ropemc.api.wrapper.net.minecraft.scoreboard.ServerScoreboard;
//import de.ropemc.api.wrapper.net.minecraft.world.WorldSettings$GameType;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.server.management.ServerConfigurationManager")
public interface ServerConfigurationManager {

    //void addOp(GameProfile var0);

    //void addWhitelistedPlayer(GameProfile var0);

    //String allowUserToConnect(SocketAddress var0, GameProfile var1);

    //boolean canJoin(GameProfile var0);

    //boolean canSendCommands(GameProfile var0);

    //EntityPlayerMP createPlayerForUser(GameProfile var0);

    String func_181058_b(boolean var0);

    //boolean func_183023_f(GameProfile var0);

    //GameProfile[] getAllProfiles();

    String[] getAllUsernames();

    String[] getAvailablePlayerDat();

    BanList getBannedIPs();

    UserListBans getBannedPlayers();

    int getCurrentPlayerCount();

    int getEntityViewDistance();

    NBTTagCompound getHostPlayerData();

    int getMaxPlayers();

    String[] getOppedPlayerNames();

    UserListOps getOppedPlayers();

    EntityPlayerMP getPlayerByUUID(UUID var0);

    EntityPlayerMP getPlayerByUsername(String var0);

    List getPlayerList();

    StatisticsFile getPlayerStatsFile(EntityPlayer var0);

    List getPlayersMatchingAddress(String var0);

    //MinecraftServer getServerInstance();

    int getViewDistance();

    String[] getWhitelistedPlayerNames();

    UserListWhitelist getWhitelistedPlayers();

    void initializeConnectionToPlayer(NetworkManager var0, EntityPlayerMP var1);

    boolean isWhiteListEnabled();

    void loadWhiteList();

    void onTick();

    void playerLoggedIn(EntityPlayerMP var0);

    void playerLoggedOut(EntityPlayerMP var0);

    void preparePlayer(EntityPlayerMP var0, WorldServer var1);

    NBTTagCompound readPlayerDataFromFile(EntityPlayerMP var0);

    EntityPlayerMP recreatePlayerEntity(EntityPlayerMP var0, int var1, boolean var2);

    void removeAllPlayers();

    //void removeOp(GameProfile var0);

    //void removePlayerFromWhitelist(GameProfile var0);

    void saveAllPlayerData();

    void sendChatMsg(IChatComponent var0);

    void sendChatMsgImpl(IChatComponent var0, boolean var1);

    void sendMessageToAllTeamMembers(EntityPlayer var0, IChatComponent var1);

    void sendMessageToTeamOrEvryPlayer(EntityPlayer var0, IChatComponent var1);

    void sendPacketToAllPlayers(Packet var0);

    void sendPacketToAllPlayersInDimension(Packet var0, int var1);

    void sendScoreboard(ServerScoreboard var0, EntityPlayerMP var1);

    void sendToAllNear(double var0, double var1, double var2, double var3, int var4, Packet var5);

    void sendToAllNearExcept(EntityPlayer var0, double var1, double var2, double var3, double var4, int var5, Packet var6);

    void serverUpdateMountedMovingPlayer(EntityPlayerMP var0);

    void setCommandsAllowedForAll(boolean var0);

    //void setGameType(WorldSettings$GameType var0);

    void setPlayerGameTypeBasedOnOther(EntityPlayerMP var0, EntityPlayerMP var1, World var2);

    void setPlayerManager(WorldServer[] var0);

    void setViewDistance(int var0);

    void setWhiteListEnabled(boolean var0);

    void syncPlayerInventory(EntityPlayerMP var0);

    void transferEntityToWorld(Entity var0, int var1, WorldServer var2, WorldServer var3);

    void transferPlayerToDimension(EntityPlayerMP var0, int var1);

    void updateTimeAndWeatherForPlayer(EntityPlayerMP var0, WorldServer var1);

    void writePlayerData(EntityPlayerMP var0);

}
