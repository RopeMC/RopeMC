package de.ropemc.api.wrapper.net.minecraft.entity.ai.attributes;

import java.util.UUID;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.attributes.AttributeModifier")
public interface AttributeModifier {

    double getAmount();

    UUID getID();

    String getName();

    int getOperation();

    boolean isSaved();

    AttributeModifier setSaved(boolean var0);

}
