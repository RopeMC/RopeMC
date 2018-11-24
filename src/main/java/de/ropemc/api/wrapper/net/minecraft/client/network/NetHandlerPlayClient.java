package de.ropemc.api.wrapper.net.minecraft.client.network;

import de.ropemc.api.wrapper.net.minecraft.network.NetworkManager;
import de.ropemc.api.wrapper.net.minecraft.client.Minecraft;
import de.ropemc.api.wrapper.net.minecraft.network.Packet;
//import com.mojang.authlib.GameProfile;
import java.util.UUID;
import java.util.Collection;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S0BPacketAnimation;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S24PacketBlockAction;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S25PacketBlockBreakAnim;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S23PacketBlockChange;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S43PacketCamera;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S2BPacketChangeGameState;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S02PacketChat;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S21PacketChunkData;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S2EPacketCloseWindow;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S0DPacketCollectItem;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S42PacketCombatEvent;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S32PacketConfirmTransaction;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S3FPacketCustomPayload;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S13PacketDestroyEntities;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S40PacketDisconnect;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S3DPacketDisplayScoreboard;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S28PacketEffect;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S1BPacketEntityAttach;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S1DPacketEntityEffect;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S04PacketEntityEquipment;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S19PacketEntityHeadLook;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S1CPacketEntityMetadata;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S14PacketEntity;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S49PacketUpdateEntityNBT;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S20PacketEntityProperties;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S19PacketEntityStatus;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S18PacketEntityTeleport;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S12PacketEntityVelocity;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S27PacketExplosion;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S09PacketHeldItemChange;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S01PacketJoinGame;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S00PacketKeepAlive;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S26PacketMapChunkBulk;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S34PacketMaps;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S22PacketMultiBlockChange;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S2DPacketOpenWindow;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S2APacketParticles;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S39PacketPlayerAbilities;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S47PacketPlayerListHeaderFooter;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S38PacketPlayerListItem;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S08PacketPlayerPosLook;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S1EPacketRemoveEntityEffect;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S48PacketResourcePackSend;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S07PacketRespawn;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S3BPacketScoreboardObjective;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S41PacketServerDifficulty;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S46PacketSetCompressionLevel;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S1FPacketSetExperience;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S2FPacketSetSlot;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S36PacketSignEditorOpen;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S29PacketSoundEffect;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S11PacketSpawnExperienceOrb;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S2CPacketSpawnGlobalEntity;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S0FPacketSpawnMob;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S0EPacketSpawnObject;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S10PacketSpawnPainting;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S0CPacketSpawnPlayer;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S05PacketSpawnPosition;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S37PacketStatistics;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S3APacketTabComplete;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S3EPacketTeams;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S03PacketTimeUpdate;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S45PacketTitle;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S06PacketUpdateHealth;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S3CPacketUpdateScore;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S33PacketUpdateSign;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S0APacketUseBed;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S30PacketWindowItems;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S31PacketWindowProperty;
import de.ropemc.api.wrapper.net.minecraft.network.play.server.S44PacketWorldBorder;
import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.network.NetHandlerPlayClient")
public interface NetHandlerPlayClient {

    //NetworkManager access$000(NetHandlerPlayClient var0);

    //Minecraft access$100(NetHandlerPlayClient var0);

    //Minecraft access$102(NetHandlerPlayClient var0, Minecraft var1);

    void addToSendQueue(Packet var0);

    void cleanup();

    //GameProfile getGameProfile();

    NetworkManager getNetworkManager();

    NetworkPlayerInfo getPlayerInfo(String var0);

    NetworkPlayerInfo getPlayerInfo(UUID var0);

    Collection getPlayerInfoMap();

    void handleAnimation(S0BPacketAnimation var0);

    void handleBlockAction(S24PacketBlockAction var0);

    void handleBlockBreakAnim(S25PacketBlockBreakAnim var0);

    void handleBlockChange(S23PacketBlockChange var0);

    void handleCamera(S43PacketCamera var0);

    void handleChangeGameState(S2BPacketChangeGameState var0);

    void handleChat(S02PacketChat var0);

    void handleChunkData(S21PacketChunkData var0);

    void handleCloseWindow(S2EPacketCloseWindow var0);

    void handleCollectItem(S0DPacketCollectItem var0);

    void handleCombatEvent(S42PacketCombatEvent var0);

    void handleConfirmTransaction(S32PacketConfirmTransaction var0);

    void handleCustomPayload(S3FPacketCustomPayload var0);

    void handleDestroyEntities(S13PacketDestroyEntities var0);

    void handleDisconnect(S40PacketDisconnect var0);

    void handleDisplayScoreboard(S3DPacketDisplayScoreboard var0);

    void handleEffect(S28PacketEffect var0);

    void handleEntityAttach(S1BPacketEntityAttach var0);

    void handleEntityEffect(S1DPacketEntityEffect var0);

    void handleEntityEquipment(S04PacketEntityEquipment var0);

    void handleEntityHeadLook(S19PacketEntityHeadLook var0);

    void handleEntityMetadata(S1CPacketEntityMetadata var0);

    void handleEntityMovement(S14PacketEntity var0);

    void handleEntityNBT(S49PacketUpdateEntityNBT var0);

    void handleEntityProperties(S20PacketEntityProperties var0);

    void handleEntityStatus(S19PacketEntityStatus var0);

    void handleEntityTeleport(S18PacketEntityTeleport var0);

    void handleEntityVelocity(S12PacketEntityVelocity var0);

    void handleExplosion(S27PacketExplosion var0);

    void handleHeldItemChange(S09PacketHeldItemChange var0);

    void handleJoinGame(S01PacketJoinGame var0);

    void handleKeepAlive(S00PacketKeepAlive var0);

    void handleMapChunkBulk(S26PacketMapChunkBulk var0);

    void handleMaps(S34PacketMaps var0);

    void handleMultiBlockChange(S22PacketMultiBlockChange var0);

    void handleOpenWindow(S2DPacketOpenWindow var0);

    void handleParticles(S2APacketParticles var0);

    void handlePlayerAbilities(S39PacketPlayerAbilities var0);

    void handlePlayerListHeaderFooter(S47PacketPlayerListHeaderFooter var0);

    void handlePlayerListItem(S38PacketPlayerListItem var0);

    void handlePlayerPosLook(S08PacketPlayerPosLook var0);

    void handleRemoveEntityEffect(S1EPacketRemoveEntityEffect var0);

    void handleResourcePack(S48PacketResourcePackSend var0);

    void handleRespawn(S07PacketRespawn var0);

    void handleScoreboardObjective(S3BPacketScoreboardObjective var0);

    void handleServerDifficulty(S41PacketServerDifficulty var0);

    void handleSetCompressionLevel(S46PacketSetCompressionLevel var0);

    void handleSetExperience(S1FPacketSetExperience var0);

    void handleSetSlot(S2FPacketSetSlot var0);

    void handleSignEditorOpen(S36PacketSignEditorOpen var0);

    void handleSoundEffect(S29PacketSoundEffect var0);

    void handleSpawnExperienceOrb(S11PacketSpawnExperienceOrb var0);

    void handleSpawnGlobalEntity(S2CPacketSpawnGlobalEntity var0);

    void handleSpawnMob(S0FPacketSpawnMob var0);

    void handleSpawnObject(S0EPacketSpawnObject var0);

    void handleSpawnPainting(S10PacketSpawnPainting var0);

    void handleSpawnPlayer(S0CPacketSpawnPlayer var0);

    void handleSpawnPosition(S05PacketSpawnPosition var0);

    void handleStatistics(S37PacketStatistics var0);

    void handleTabComplete(S3APacketTabComplete var0);

    void handleTeams(S3EPacketTeams var0);

    void handleTimeUpdate(S03PacketTimeUpdate var0);

    void handleTitle(S45PacketTitle var0);

    void handleUpdateHealth(S06PacketUpdateHealth var0);

    void handleUpdateScore(S3CPacketUpdateScore var0);

    void handleUpdateSign(S33PacketUpdateSign var0);

    void handleUpdateTileEntity(S35PacketUpdateTileEntity var0);

    void handleUseBed(S0APacketUseBed var0);

    void handleWindowItems(S30PacketWindowItems var0);

    void handleWindowProperty(S31PacketWindowProperty var0);

    void handleWorldBorder(S44PacketWorldBorder var0);

    void onDisconnect(IChatComponent var0);

}
