package de.ropemc.api.wrapper.net.minecraft.entity.boss;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.boss.BossStatus")
public interface BossStatus {

    void setBossStatus(IBossDisplayData var0, boolean var1);

}
