package de.ropemc.api.wrapper.net.minecraft.client.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.ThreadDownloadImageData;
import de.ropemc.api.wrapper.net.minecraft.client.network.NetworkPlayerInfo;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.entity.AbstractClientPlayer")
public interface AbstractClientPlayer extends EntityPlayer {

    ThreadDownloadImageData getDownloadImageSkin(ResourceLocation var0, String var1);

    float getFovModifier();

    ResourceLocation getLocationCape();

    ResourceLocation getLocationSkin();

    ResourceLocation getLocationSkin(String var0);

    NetworkPlayerInfo getPlayerInfo();

    String getSkinType();

    boolean hasPlayerInfo();

    boolean hasSkin();

    boolean isSpectator();

}
