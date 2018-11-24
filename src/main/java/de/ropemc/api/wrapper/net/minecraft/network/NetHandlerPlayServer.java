package de.ropemc.api.wrapper.net.minecraft.network;

import de.ropemc.api.wrapper.net.minecraft.network.play.client.C03PacketPlayer;
import de.ropemc.api.wrapper.net.minecraft.network.play.client.C0APacketAnimation;
import de.ropemc.api.wrapper.net.minecraft.network.play.client.C19PacketResourcePackStatus;
import de.ropemc.api.wrapper.net.minecraft.network.play.client.C18PacketSpectate;
import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.net.minecraft.network.play.client.C01PacketChatMessage;
import de.ropemc.api.wrapper.net.minecraft.network.play.client.C0EPacketClickWindow;
import de.ropemc.api.wrapper.net.minecraft.network.play.client.C15PacketClientSettings;
import de.ropemc.api.wrapper.net.minecraft.network.play.client.C16PacketClientStatus;
import de.ropemc.api.wrapper.net.minecraft.network.play.client.C0DPacketCloseWindow;
import de.ropemc.api.wrapper.net.minecraft.network.play.client.C0FPacketConfirmTransaction;
import de.ropemc.api.wrapper.net.minecraft.network.play.client.C10PacketCreativeInventoryAction;
import de.ropemc.api.wrapper.net.minecraft.network.play.client.C11PacketEnchantItem;
import de.ropemc.api.wrapper.net.minecraft.network.play.client.C0BPacketEntityAction;
import de.ropemc.api.wrapper.net.minecraft.network.play.client.C09PacketHeldItemChange;
import de.ropemc.api.wrapper.net.minecraft.network.play.client.C0CPacketInput;
import de.ropemc.api.wrapper.net.minecraft.network.play.client.C00PacketKeepAlive;
import de.ropemc.api.wrapper.net.minecraft.network.play.client.C13PacketPlayerAbilities;
import de.ropemc.api.wrapper.net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
import de.ropemc.api.wrapper.net.minecraft.network.play.client.C07PacketPlayerDigging;
import de.ropemc.api.wrapper.net.minecraft.network.play.client.C14PacketTabComplete;
import de.ropemc.api.wrapper.net.minecraft.network.play.client.C12PacketUpdateSign;
import de.ropemc.api.wrapper.net.minecraft.network.play.client.C02PacketUseEntity;
import de.ropemc.api.wrapper.net.minecraft.network.play.client.C17PacketCustomPayload;
import java.util.Set;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.NetHandlerPlayServer")
public interface NetHandlerPlayServer {

    long currentTimeMillis();

    boolean func_183006_b(C03PacketPlayer var0);

    NetworkManager getNetworkManager();

    void handleAnimation(C0APacketAnimation var0);

    void handleResourcePackStatus(C19PacketResourcePackStatus var0);

    void handleSlashCommand(String var0);

    void handleSpectate(C18PacketSpectate var0);

    void kickPlayerFromServer(String var0);

    void onDisconnect(IChatComponent var0);

    void processChatMessage(C01PacketChatMessage var0);

    void processClickWindow(C0EPacketClickWindow var0);

    void processClientSettings(C15PacketClientSettings var0);

    void processClientStatus(C16PacketClientStatus var0);

    void processCloseWindow(C0DPacketCloseWindow var0);

    void processConfirmTransaction(C0FPacketConfirmTransaction var0);

    void processCreativeInventoryAction(C10PacketCreativeInventoryAction var0);

    void processEnchantItem(C11PacketEnchantItem var0);

    void processEntityAction(C0BPacketEntityAction var0);

    void processHeldItemChange(C09PacketHeldItemChange var0);

    void processInput(C0CPacketInput var0);

    void processKeepAlive(C00PacketKeepAlive var0);

    void processPlayer(C03PacketPlayer var0);

    void processPlayerAbilities(C13PacketPlayerAbilities var0);

    void processPlayerBlockPlacement(C08PacketPlayerBlockPlacement var0);

    void processPlayerDigging(C07PacketPlayerDigging var0);

    void processTabComplete(C14PacketTabComplete var0);

    void processUpdateSign(C12PacketUpdateSign var0);

    void processUseEntity(C02PacketUseEntity var0);

    void processVanilla250Packet(C17PacketCustomPayload var0);

    void sendPacket(Packet var0);

    void setPlayerLocation(double var0, double var1, double var2, float var3, float var4);

    void setPlayerLocation(double var0, double var1, double var2, float var3, float var4, Set var5);

    void update();

}
