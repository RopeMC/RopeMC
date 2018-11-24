package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.ChatLine")
public interface ChatLine {

    IChatComponent getChatComponent();

    int getChatLineID();

    int getUpdatedCounter();

}
