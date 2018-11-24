package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.CombatTracker")
public interface CombatTracker {

    int func_180134_f();

    void func_94542_g();

    CombatEntry func_94544_f();

    void func_94545_a();

    String func_94548_b(CombatEntry var0);

    EntityLivingBase func_94550_c();

    IChatComponent getDeathMessage();

    EntityLivingBase getFighter();

    void reset();

    void trackDamage(DamageSource var0, float var1, float var2);

}
