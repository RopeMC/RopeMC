package de.ropemc.api.wrapper.net.minecraft.client.resources.model;

import java.util.Map;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.block.model.ModelBlock;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import java.util.Set;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.block.model.ModelBlockDefinition;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import java.util.Collection;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.block.model.BlockPart;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.block.model.BlockPartFace;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.texture.TextureAtlasSprite;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.block.model.BakedQuad;
import de.ropemc.api.wrapper.net.minecraft.util.IRegistry;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.resources.model.ModelBakery")
public interface ModelBakery {

    //Map access$000(ModelBakery var0);

    void bakeBlockModels();

    void bakeItemModels();

    IBakedModel bakeModel(ModelBlock var0, ModelRotation var1, boolean var2);

    ResourceLocation getBlockStateLocation(ResourceLocation var0);

    ResourceLocation getItemLocation(String var0);

    Set getItemsTextureLocations();

    ModelBlockDefinition getModelBlockDefinition(ResourceLocation var0);

    ResourceLocation getModelLocation(ResourceLocation var0);

    ResourceLocation getParentLocation(ResourceLocation var0);

    List getParentPath(ResourceLocation var0);

    Set getTextureLocations(ModelBlock var0);

    List getVariantNames(Item var0);

    Set getVariantsTextureLocations();

    boolean hasItemModel(ModelBlock var0);

    boolean isCustomRenderer(ModelBlock var0);

    void loadItemModels();

    ModelBlock loadModel(ResourceLocation var0);

    void loadModels();

    void loadModelsCheck();

    void loadSprites();

    void loadVariantItemModels();

    void loadVariantModels();

    void loadVariants(Collection var0);

    BakedQuad makeBakedQuad(BlockPart var0, BlockPartFace var1, TextureAtlasSprite var2, EnumFacing var3, ModelRotation var4, boolean var5);

    ModelBlock makeItemModel(ModelBlock var0);

    void registerVariant(ModelBlockDefinition var0, ModelResourceLocation var1);

    void registerVariantNames();

    IRegistry setupModelRegistry();

}
