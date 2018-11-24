package de.ropemc.api.wrapper.net.minecraft.entity;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.IEntityOwnable")
public interface IEntityOwnable {

    Entity getOwner();

    String getOwnerId();

}
