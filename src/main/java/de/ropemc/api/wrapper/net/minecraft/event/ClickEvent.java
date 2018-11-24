package de.ropemc.api.wrapper.net.minecraft.event;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.event.ClickEvent")
public interface ClickEvent {

    //ClickEvent$Action getAction();

    String getValue();

}
