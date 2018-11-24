package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity.layers;

import de.ropemc.api.wrapper.net.minecraft.client.model.ModelBase;
import de.ropemc.api.wrapper.net.minecraft.client.model.ModelBiped;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.layers.LayerBipedArmor")
public interface LayerBipedArmor {

    void func_177179_a(ModelBase var0, int var1);

    void func_177179_a(ModelBiped var0, int var1);

    void func_177194_a(ModelBiped var0);

    void initArmor();

}
