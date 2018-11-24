package de.ropemc.api.wrapper.net.minecraft.world;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.ILockableContainer")
public interface ILockableContainer {

    LockCode getLockCode();

    boolean isLocked();

    void setLockCode(LockCode var0);

}
