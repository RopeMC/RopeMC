package de.ropemc.api.wrapper.net.minecraft.item;

import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.creativetab.CreativeTabs;
//import com.google.common.collect.Multimap;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.MovingObjectPosition;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.Item")
public interface Item {

    void addInformation(ItemStack var0, EntityPlayer var1, List var2, boolean var3);

    boolean canHarvestBlock(Block var0);

    boolean canItemEditBlocks();

    Item getByNameOrId(String var0);

    int getColorFromItemStack(ItemStack var0, int var1);

    Item getContainerItem();

    CreativeTabs getCreativeTab();

    boolean getHasSubtypes();

    int getIdFromItem(Item var0);

    boolean getIsRepairable(ItemStack var0, ItemStack var1);

    //Multimap getItemAttributeModifiers();

    Item getItemById(int var0);

    int getItemEnchantability();

    Item getItemFromBlock(Block var0);

    String getItemStackDisplayName(ItemStack var0);

    int getItemStackLimit();

    EnumAction getItemUseAction(ItemStack var0);

    int getMaxDamage();

    int getMaxItemUseDuration(ItemStack var0);

    int getMetadata(int var0);

    MovingObjectPosition getMovingObjectPositionFromPlayer(World var0, EntityPlayer var1, boolean var2);

    String getPotionEffect(ItemStack var0);

    EnumRarity getRarity(ItemStack var0);

    boolean getShareTag();

    float getStrVsBlock(ItemStack var0, Block var1);

    void getSubItems(Item var0, CreativeTabs var1, List var2);

    String getUnlocalizedName();

    String getUnlocalizedName(ItemStack var0);

    String getUnlocalizedNameInefficiently(ItemStack var0);

    boolean hasContainerItem();

    boolean hasEffect(ItemStack var0);

    boolean hitEntity(ItemStack var0, EntityLivingBase var1, EntityLivingBase var2);

    boolean isDamageable();

    boolean isFull3D();

    boolean isItemTool(ItemStack var0);

    boolean isMap();

    boolean isPotionIngredient(ItemStack var0);

    boolean itemInteractionForEntity(ItemStack var0, EntityPlayer var1, EntityLivingBase var2);

    boolean onBlockDestroyed(ItemStack var0, World var1, Block var2, BlockPos var3, EntityLivingBase var4);

    void onCreated(ItemStack var0, World var1, EntityPlayer var2);

    ItemStack onItemRightClick(ItemStack var0, World var1, EntityPlayer var2);

    boolean onItemUse(ItemStack var0, EntityPlayer var1, World var2, BlockPos var3, EnumFacing var4, float var5, float var6, float var7);

    ItemStack onItemUseFinish(ItemStack var0, World var1, EntityPlayer var2);

    void onPlayerStoppedUsing(ItemStack var0, World var1, EntityPlayer var2, int var3);

    void onUpdate(ItemStack var0, World var1, Entity var2, int var3, boolean var4);

    void registerItem(int var0, String var1, Item var2);

    void registerItem(int var0, ResourceLocation var1, Item var2);

    void registerItemBlock(Block var0);

    void registerItemBlock(Block var0, Item var1);

    void registerItems();

    Item setContainerItem(Item var0);

    Item setCreativeTab(CreativeTabs var0);

    Item setFull3D();

    Item setHasSubtypes(boolean var0);

    Item setMaxDamage(int var0);

    Item setMaxStackSize(int var0);

    Item setPotionEffect(String var0);

    Item setUnlocalizedName(String var0);

    boolean shouldRotateAroundWhenRendering();

    boolean updateItemStackNBT(NBTTagCompound var0);

}
