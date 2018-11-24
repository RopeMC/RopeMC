package de.ropemc.api.wrapper.net.minecraft.client.audio;

import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.audio.PositionedSoundRecord")
public interface PositionedSoundRecord {

    PositionedSoundRecord create(ResourceLocation var0);

    PositionedSoundRecord create(ResourceLocation var0, float var1);

    PositionedSoundRecord create(ResourceLocation var0, float var1, float var2, float var3);

}
