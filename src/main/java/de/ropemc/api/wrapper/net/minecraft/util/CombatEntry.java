package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.CombatEntry")
public interface CombatEntry {

    String func_94562_g();

    float func_94563_c();

    float getDamageAmount();

    DamageSource getDamageSrc();

    IChatComponent getDamageSrcDisplayName();

    boolean isLivingDamageSrc();

}
