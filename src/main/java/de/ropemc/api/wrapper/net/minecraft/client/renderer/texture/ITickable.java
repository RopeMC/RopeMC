package de.ropemc.api.wrapper.net.minecraft.client.renderer.texture;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.texture.ITickable")
public interface ITickable {

    void tick();

}
