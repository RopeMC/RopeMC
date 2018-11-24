package de.ropemc.api.wrapper.net.minecraft.client.resources.data;

import java.util.Set;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.resources.data.AnimationMetadataSection")
public interface AnimationMetadataSection {

    boolean frameHasTime(int var0);

    AnimationFrame getAnimationFrame(int var0);

    int getFrameCount();

    int getFrameHeight();

    int getFrameIndex(int var0);

    Set getFrameIndexSet();

    int getFrameTime();

    int getFrameTimeSingle(int var0);

    int getFrameWidth();

    boolean isInterpolate();

}
