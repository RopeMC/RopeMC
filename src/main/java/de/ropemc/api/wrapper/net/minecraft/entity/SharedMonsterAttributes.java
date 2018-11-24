package de.ropemc.api.wrapper.net.minecraft.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.ai.attributes.IAttributeInstance;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.net.minecraft.entity.ai.attributes.BaseAttributeMap;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagList;
import de.ropemc.api.wrapper.net.minecraft.entity.ai.attributes.AttributeModifier;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.SharedMonsterAttributes")
public interface SharedMonsterAttributes {

    void applyModifiersToAttributeInstance(IAttributeInstance var0, NBTTagCompound var1);

    void func_151475_a(BaseAttributeMap var0, NBTTagList var1);

    AttributeModifier readAttributeModifierFromNBT(NBTTagCompound var0);

    NBTTagCompound writeAttributeInstanceToNBT(IAttributeInstance var0);

    NBTTagCompound writeAttributeModifierToNBT(AttributeModifier var0);

    NBTTagList writeBaseAttributeMapToNBT(BaseAttributeMap var0);

}
