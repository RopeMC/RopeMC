package de.ropemc.api.wrapper.net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.structure.StructureVillagePieces")
public interface StructureVillagePieces {

    //StructureComponent access$000(StructureVillagePieces$Start var0, List var1, Random var2, int var3, int var4, int var5, EnumFacing var6, int var7);

    //StructureComponent access$100(StructureVillagePieces$Start var0, List var1, Random var2, int var3, int var4, int var5, EnumFacing var6, int var7);

    //StructureVillagePieces$Village func_176065_a(StructureVillagePieces$Start var0, StructureVillagePieces$PieceWeight var1, List var2, Random var3, int var4, int var5, int var6, EnumFacing var7, int var8);

    //StructureComponent func_176066_d(StructureVillagePieces$Start var0, List var1, Random var2, int var3, int var4, int var5, EnumFacing var6, int var7);

    //StructureVillagePieces$Village func_176067_c(StructureVillagePieces$Start var0, List var1, Random var2, int var3, int var4, int var5, EnumFacing var6, int var7);

    //StructureComponent func_176069_e(StructureVillagePieces$Start var0, List var1, Random var2, int var3, int var4, int var5, EnumFacing var6, int var7);

    int func_75079_a(List var0);

    List getStructureVillageWeightedPieceList(Random var0, int var1);

    void registerVillagePieces();

}
