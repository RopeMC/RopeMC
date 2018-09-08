package de.ropemc.utils;

import de.ropemc.Mappings;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Helper {

    public static String getMessageFromChatPacket(Object packet) {
        try {
            Field f1 = packet.getClass().getDeclaredField(Mappings.getFieldName("net.minecraft.network.play.server.S02PacketChat", "chatComponent"));
            Object chat_component = f1.get(packet);
            Method m1 = chat_component.getClass().getDeclaredMethod(Mappings.getMethodName("net.minecraft.util.IChatComponent", "getUnformattedText"));
            return (String) m1.invoke(chat_component);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
