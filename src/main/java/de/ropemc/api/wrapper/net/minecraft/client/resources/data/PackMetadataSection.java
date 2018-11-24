package de.ropemc.api.wrapper.net.minecraft.client.resources.data;

import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.resources.data.PackMetadataSection")
public interface PackMetadataSection {

    IChatComponent getPackDescription();

    int getPackFormat();

}
