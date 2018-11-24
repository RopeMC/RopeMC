package de.ropemc.api.wrapper.net.minecraft.server.management;

//import org.apache.logging.log4j.Logger;
import de.ropemc.api.wrapper.net.minecraft.world.WorldServer;
import de.ropemc.api.wrapper.net.minecraft.util.LongHashMap;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayerMP;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.server.management.PlayerManager")
public interface PlayerManager {

    //Logger access$000();

    //WorldServer access$100(PlayerManager var0);

    //LongHashMap access$200(PlayerManager var0);

    //List access$300(PlayerManager var0);

    //List access$400(PlayerManager var0);

    void addPlayer(EntityPlayerMP var0);

    void filterChunkLoadQueue(EntityPlayerMP var0);

    int getFurthestViewableBlock(int var0);

    //PlayerManager$PlayerInstance getPlayerInstance(int var0, int var1, boolean var2);

    WorldServer getWorldServer();

    boolean hasPlayerInstance(int var0, int var1);

    boolean isPlayerWatchingChunk(EntityPlayerMP var0, int var1, int var2);

    void markBlockForUpdate(BlockPos var0);

    boolean overlaps(int var0, int var1, int var2, int var3, int var4);

    void removePlayer(EntityPlayerMP var0);

    void setPlayerViewRadius(int var0);

    void updateMountedMovingPlayer(EntityPlayerMP var0);

    void updatePlayerInstances();

}
