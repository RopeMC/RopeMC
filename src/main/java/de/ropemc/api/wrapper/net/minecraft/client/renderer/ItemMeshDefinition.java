package de.ropemc.api.wrapper.net.minecraft.client.renderer;

import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.client.resources.model.ModelResourceLocation;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.ItemMeshDefinition")
public interface ItemMeshDefinition {

    ModelResourceLocation getModelLocation(ItemStack var0);

}
