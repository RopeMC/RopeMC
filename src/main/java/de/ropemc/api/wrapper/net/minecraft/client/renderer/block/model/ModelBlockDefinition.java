package de.ropemc.api.wrapper.net.minecraft.client.renderer.block.model;

import java.io.Reader;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.block.model.ModelBlockDefinition")
public interface ModelBlockDefinition {

    //ModelBlockDefinition$Variants getVariants(String var0);

    ModelBlockDefinition parseFromReader(Reader var0);

}
