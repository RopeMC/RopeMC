package de.ropemc.api.wrapper.net.minecraft.init;

import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.init.Items")
public interface Items {

    Item getRegisteredItem(String var0);

}
