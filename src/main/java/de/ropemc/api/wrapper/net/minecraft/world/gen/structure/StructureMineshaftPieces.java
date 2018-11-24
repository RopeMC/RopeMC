package de.ropemc.api.wrapper.net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.structure.StructureMineshaftPieces")
public interface StructureMineshaftPieces {

    //StructureComponent access$000(StructureComponent var0, List var1, Random var2, int var3, int var4, int var5, EnumFacing var6, int var7);

    //List access$100();

    StructureComponent func_175890_b(StructureComponent var0, List var1, Random var2, int var3, int var4, int var5, EnumFacing var6, int var7);

    StructureComponent func_175892_a(List var0, Random var1, int var2, int var3, int var4, EnumFacing var5, int var6);

    void registerStructurePieces();

}
