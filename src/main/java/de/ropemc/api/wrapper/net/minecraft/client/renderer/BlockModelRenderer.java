package de.ropemc.api.wrapper.net.minecraft.client.renderer;

import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import java.util.BitSet;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.net.minecraft.client.resources.model.IBakedModel;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.BlockModelRenderer")
public interface BlockModelRenderer {

    void fillQuadBounds(Block var0, int[] var1, EnumFacing var2, float[] var3, BitSet var4);

    boolean renderModel(IBlockAccess var0, IBakedModel var1, IBlockState var2, BlockPos var3, WorldRenderer var4);

    boolean renderModel(IBlockAccess var0, IBakedModel var1, IBlockState var2, BlockPos var3, WorldRenderer var4, boolean var5);

    boolean renderModelAmbientOcclusion(IBlockAccess var0, IBakedModel var1, Block var2, BlockPos var3, WorldRenderer var4, boolean var5);

    //void renderModelAmbientOcclusionQuads(IBlockAccess var0, Block var1, BlockPos var2, WorldRenderer var3, List var4, float[] var5, BitSet var6, BlockModelRenderer$AmbientOcclusionFace var7);

    void renderModelBrightness(IBakedModel var0, IBlockState var1, float var2, boolean var3);

    void renderModelBrightnessColor(IBakedModel var0, float var1, float var2, float var3, float var4);

    void renderModelBrightnessColorQuads(float var0, float var1, float var2, float var3, List var4);

    boolean renderModelStandard(IBlockAccess var0, IBakedModel var1, Block var2, BlockPos var3, WorldRenderer var4, boolean var5);

    void renderModelStandardQuads(IBlockAccess var0, Block var1, BlockPos var2, EnumFacing var3, int var4, boolean var5, WorldRenderer var6, List var7, BitSet var8);

}
