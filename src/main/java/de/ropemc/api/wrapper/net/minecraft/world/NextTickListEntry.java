package de.ropemc.api.wrapper.net.minecraft.world;

import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.NextTickListEntry")
public interface NextTickListEntry {

    int compareTo(NextTickListEntry var0);

    Block getBlock();

    void setPriority(int var0);

    NextTickListEntry setScheduledTime(long var0);

}
