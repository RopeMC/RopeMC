package de.ropemc.api.wrapper.net.minecraft.client.model;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.model.ModelEnderman")
public interface ModelEnderman {

    void setRotationAngles(float var0, float var1, float var2, float var3, float var4, float var5, Entity var6);

}
