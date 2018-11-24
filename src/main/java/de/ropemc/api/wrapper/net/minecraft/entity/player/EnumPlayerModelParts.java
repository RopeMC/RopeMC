package de.ropemc.api.wrapper.net.minecraft.entity.player;

import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.player.EnumPlayerModelParts")
public interface EnumPlayerModelParts {

    IChatComponent func_179326_d();

    int getPartId();

    int getPartMask();

    String getPartName();

}
