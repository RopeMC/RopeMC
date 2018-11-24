package de.ropemc.api.wrapper.net.minecraft.client.renderer.texture;

import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.texture.Stitcher")
public interface Stitcher {

    //int access$000(int var0, int var1);

    void addSprite(TextureAtlasSprite var0);

    //boolean allocateSlot(Stitcher$Holder var0);

    void doStitch();

    //boolean expandAndAllocateSlot(Stitcher$Holder var0);

    int getCurrentHeight();

    int getCurrentWidth();

    int getMipmapDimension(int var0, int var1);

    List getStichSlots();

}
