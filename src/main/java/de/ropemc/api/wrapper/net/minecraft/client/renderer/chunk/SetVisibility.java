package de.ropemc.api.wrapper.net.minecraft.client.renderer.chunk;

import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import java.util.Set;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.chunk.SetVisibility")
public interface SetVisibility {

    boolean isVisible(EnumFacing var0, EnumFacing var1);

    void setAllVisible(boolean var0);

    void setManyVisible(Set var0);

    void setVisible(EnumFacing var0, EnumFacing var1, boolean var2);

}
