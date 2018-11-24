package de.ropemc.api.wrapper.net.minecraft.event;

import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.event.HoverEvent")
public interface HoverEvent {

    //HoverEvent$Action getAction();

    IChatComponent getValue();

}
