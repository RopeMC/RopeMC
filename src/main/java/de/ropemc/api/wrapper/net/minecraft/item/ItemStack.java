package de.ropemc.api.wrapper.net.minecraft.item;

import de.ropemc.api.wrapper.net.minecraft.enchantment.Enchantment;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
//import com.google.common.collect.Multimap;
import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagList;
import de.ropemc.api.wrapper.net.minecraft.entity.item.EntityItemFrame;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTBase;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.ItemStack")
public interface ItemStack {

    void addEnchantment(Enchantment var0, int var1);

    boolean areItemStackTagsEqual(ItemStack var0, ItemStack var1);

    boolean areItemStacksEqual(ItemStack var0, ItemStack var1);

    boolean areItemsEqual(ItemStack var0, ItemStack var1);

    boolean attemptDamageItem(int var0, Random var1);

    boolean canDestroy(Block var0);

    boolean canEditBlocks();

    boolean canHarvestBlock(Block var0);

    boolean canPlaceOn(Block var0);

    void clearCustomName();

    ItemStack copy();

    ItemStack copyItemStack(ItemStack var0);

    void damageItem(int var0, EntityLivingBase var1);

    //Multimap getAttributeModifiers();

    IChatComponent getChatComponent();

    String getDisplayName();

    NBTTagList getEnchantmentTagList();

    boolean getHasSubtypes();

    boolean getIsItemStackEqual(ItemStack var0);

    Item getItem();

    int getItemDamage();

    EntityItemFrame getItemFrame();

    EnumAction getItemUseAction();

    int getMaxDamage();

    int getMaxItemUseDuration();

    int getMaxStackSize();

    int getMetadata();

    EnumRarity getRarity();

    int getRepairCost();

    float getStrVsBlock(Block var0);

    NBTTagCompound getSubCompound(String var0, boolean var1);

    NBTTagCompound getTagCompound();

    List getTooltip(EntityPlayer var0, boolean var1);

    String getUnlocalizedName();

    boolean hasDisplayName();

    boolean hasEffect();

    boolean hasTagCompound();

    void hitEntity(EntityLivingBase var0, EntityPlayer var1);

    boolean interactWithEntity(EntityPlayer var0, EntityLivingBase var1);

    boolean isItemDamaged();

    boolean isItemEnchantable();

    boolean isItemEnchanted();

    boolean isItemEqual(ItemStack var0);

    boolean isItemStackDamageable();

    boolean isItemStackEqual(ItemStack var0);

    boolean isOnItemFrame();

    boolean isStackable();

    ItemStack loadItemStackFromNBT(NBTTagCompound var0);

    void onBlockDestroyed(World var0, Block var1, BlockPos var2, EntityPlayer var3);

    void onCrafting(World var0, EntityPlayer var1, int var2);

    boolean onItemUse(EntityPlayer var0, World var1, BlockPos var2, EnumFacing var3, float var4, float var5, float var6);

    ItemStack onItemUseFinish(World var0, EntityPlayer var1);

    void onPlayerStoppedUsing(World var0, EntityPlayer var1, int var2);

    void readFromNBT(NBTTagCompound var0);

    void setItem(Item var0);

    void setItemDamage(int var0);

    void setItemFrame(EntityItemFrame var0);

    void setRepairCost(int var0);

    ItemStack setStackDisplayName(String var0);

    void setTagCompound(NBTTagCompound var0);

    void setTagInfo(String var0, NBTBase var1);

    ItemStack splitStack(int var0);

    void updateAnimation(World var0, Entity var1, int var2, boolean var3);

    ItemStack useItemRightClick(World var0, EntityPlayer var1);

    NBTTagCompound writeToNBT(NBTTagCompound var0);

}
