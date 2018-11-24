package de.ropemc.api.wrapper.net.minecraft.item;

//import com.google.common.collect.Multimap;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.ItemTool")
public interface ItemTool {

    boolean getIsRepairable(ItemStack var0, ItemStack var1);

    //Multimap getItemAttributeModifiers();

    int getItemEnchantability();

    float getStrVsBlock(ItemStack var0, Block var1);

    //Item$ToolMaterial getToolMaterial();

    String getToolMaterialName();

    boolean hitEntity(ItemStack var0, EntityLivingBase var1, EntityLivingBase var2);

    boolean isFull3D();

    boolean onBlockDestroyed(ItemStack var0, World var1, Block var2, BlockPos var3, EntityLivingBase var4);

}
