package de.ropemc.api.wrapper.net.minecraft.client.renderer.block.model;

import java.util.Map;
import java.io.Reader;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.block.model.ModelBlock")
public interface ModelBlock {

    void checkModelHierarchy(Map var0);

    ModelBlock deserialize(Reader var0);

    ModelBlock deserialize(String var0);

    //ItemTransformVec3f func_181681_a(ItemCameraTransforms$TransformType var0);

    ItemCameraTransforms func_181682_g();

    List getElements();

    void getParentFromMap(Map var0);

    ResourceLocation getParentLocation();

    ModelBlock getRootModel();

    boolean hasParent();

    boolean isAmbientOcclusion();

    boolean isGui3d();

    boolean isResolved();

    boolean isTexturePresent(String var0);

    String resolveTextureName(String var0);

    //String resolveTextureName(String var0, ModelBlock$Bookkeep var1);

    boolean startsWithHash(String var0);

}
