package de.ropemc.api.wrapper.net.minecraft.world.storage;

//import de.ropemc.api.wrapper.net.minecraft.world.WorldSettings$GameType;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.storage.SaveFormatComparator")
public interface SaveFormatComparator {

    int compareTo(SaveFormatComparator var0);

    boolean getCheatsEnabled();

    String getDisplayName();

    //WorldSettings$GameType getEnumGameType();

    String getFileName();

    long getLastTimePlayed();

    long getSizeOnDisk();

    boolean isHardcoreModeEnabled();

    boolean requiresConversion();

}
