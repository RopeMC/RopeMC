package de.ropemc.api.wrapper.net.minecraft.client.resources;

import java.util.UUID;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.resources.DefaultPlayerSkin")
public interface DefaultPlayerSkin {

    ResourceLocation getDefaultSkin(UUID var0);

    ResourceLocation getDefaultSkinLegacy();

    String getSkinType(UUID var0);

    boolean isSlimSkin(UUID var0);

}
