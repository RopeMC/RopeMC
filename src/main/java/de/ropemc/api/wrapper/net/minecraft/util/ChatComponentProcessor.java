package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.net.minecraft.command.ICommandSender;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.ChatComponentProcessor")
public interface ChatComponentProcessor {

    IChatComponent processComponent(ICommandSender var0, IChatComponent var1, Entity var2);

}
