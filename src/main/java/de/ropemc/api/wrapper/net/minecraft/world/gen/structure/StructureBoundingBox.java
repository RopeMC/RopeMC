package de.ropemc.api.wrapper.net.minecraft.world.gen.structure;

import de.ropemc.api.wrapper.net.minecraft.util.Vec3i;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagIntArray;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.structure.StructureBoundingBox")
public interface StructureBoundingBox {

    void expandTo(StructureBoundingBox var0);

    Vec3i func_175896_b();

    StructureBoundingBox func_175899_a(int var0, int var1, int var2, int var3, int var4, int var5);

    Vec3i getCenter();

    StructureBoundingBox getComponentToAddBoundingBox(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, EnumFacing var9);

    StructureBoundingBox getNewBoundingBox();

    int getXSize();

    int getYSize();

    int getZSize();

    boolean intersectsWith(int var0, int var1, int var2, int var3);

    boolean intersectsWith(StructureBoundingBox var0);

    boolean isVecInside(Vec3i var0);

    void offset(int var0, int var1, int var2);

    NBTTagIntArray toNBTTagIntArray();

}
