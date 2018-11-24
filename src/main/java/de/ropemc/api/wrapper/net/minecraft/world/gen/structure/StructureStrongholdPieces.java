package de.ropemc.api.wrapper.net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.structure.StructureStrongholdPieces")
public interface StructureStrongholdPieces {

    //StructureComponent access$000(StructureStrongholdPieces$Stairs2 var0, List var1, Random var2, int var3, int var4, int var5, EnumFacing var6, int var7);

    //Class access$102(Class var0);

    //StructureStrongholdPieces$Stones access$200();

    boolean canAddStructurePieces();

    //StructureComponent func_175953_c(StructureStrongholdPieces$Stairs2 var0, List var1, Random var2, int var3, int var4, int var5, EnumFacing var6, int var7);

    //StructureStrongholdPieces$Stronghold func_175954_a(Class var0, List var1, Random var2, int var3, int var4, int var5, EnumFacing var6, int var7);

    //StructureStrongholdPieces$Stronghold func_175955_b(StructureStrongholdPieces$Stairs2 var0, List var1, Random var2, int var3, int var4, int var5, EnumFacing var6, int var7);

    void prepareStructurePieces();

    void registerStrongholdPieces();

}
