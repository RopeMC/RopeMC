package de.ropemc.api.wrapper.net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.structure.StructureNetherBridgePieces")
public interface StructureNetherBridgePieces {

    //StructureNetherBridgePieces$Piece access$000(StructureNetherBridgePieces$PieceWeight var0, List var1, Random var2, int var3, int var4, int var5, EnumFacing var6, int var7);

    //StructureNetherBridgePieces$PieceWeight[] access$100();

    //StructureNetherBridgePieces$PieceWeight[] access$200();

    //StructureNetherBridgePieces$Piece func_175887_b(StructureNetherBridgePieces$PieceWeight var0, List var1, Random var2, int var3, int var4, int var5, EnumFacing var6, int var7);

    void registerNetherFortressPieces();

}
