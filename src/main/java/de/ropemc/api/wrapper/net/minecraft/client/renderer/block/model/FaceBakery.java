package de.ropemc.api.wrapper.net.minecraft.client.renderer.block.model;

import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.texture.TextureAtlasSprite;
import de.ropemc.api.wrapper.net.minecraft.client.resources.model.ModelRotation;
//import org.lwjgl.util.vector.Vector3f;
//import org.lwjgl.util.vector.Matrix4f;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.block.model.FaceBakery")
public interface FaceBakery {

    void fillVertexData(int[] var0, int var1, EnumFacing var2, BlockPartFace var3, float[] var4, TextureAtlasSprite var5, ModelRotation var6, BlockPartRotation var7, boolean var8, boolean var9);

    void func_178401_a(int var0, int[] var1, EnumFacing var2, BlockFaceUV var3, TextureAtlasSprite var4);

    //void func_178407_a(Vector3f var0, BlockPartRotation var1);

    void func_178408_a(int[] var0, EnumFacing var1);

    void func_178409_a(int[] var0, EnumFacing var1, BlockFaceUV var2, TextureAtlasSprite var3);

    float getFaceBrightness(EnumFacing var0);

    int getFaceShadeColor(EnumFacing var0);

    EnumFacing getFacingFromVertexData(int[] var0);

    //Matrix4f getMatrixIdentity();

    //float[] getPositionsDiv16(Vector3f var0, Vector3f var1);

    //BakedQuad makeBakedQuad(Vector3f var0, Vector3f var1, BlockPartFace var2, TextureAtlasSprite var3, EnumFacing var4, ModelRotation var5, BlockPartRotation var6, boolean var7, boolean var8);

    int[] makeQuadVertexData(BlockPartFace var0, TextureAtlasSprite var1, EnumFacing var2, float[] var3, ModelRotation var4, BlockPartRotation var5, boolean var6, boolean var7);

    //void rotateScale(Vector3f var0, Vector3f var1, Matrix4f var2, Vector3f var3);

    //int rotateVertex(Vector3f var0, EnumFacing var1, int var2, ModelRotation var3, boolean var4);

    //void storeVertexData(int[] var0, int var1, int var2, Vector3f var3, int var4, TextureAtlasSprite var5, BlockFaceUV var6);

}
