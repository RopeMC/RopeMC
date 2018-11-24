package de.ropemc.api.wrapper.net.minecraft.dispenser;

import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.entity.IProjectile;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.dispenser.BehaviorProjectileDispense")
public interface BehaviorProjectileDispense {

    ItemStack dispenseStack(IBlockSource var0, ItemStack var1);

    float func_82498_a();

    float func_82500_b();

    IProjectile getProjectileEntity(World var0, IPosition var1);

    void playDispenseSound(IBlockSource var0);

}
