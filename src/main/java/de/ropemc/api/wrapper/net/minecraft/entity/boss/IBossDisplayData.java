package de.ropemc.api.wrapper.net.minecraft.entity.boss;

import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.boss.IBossDisplayData")
public interface IBossDisplayData {

    IChatComponent getDisplayName();

    float getHealth();

    float getMaxHealth();

}
