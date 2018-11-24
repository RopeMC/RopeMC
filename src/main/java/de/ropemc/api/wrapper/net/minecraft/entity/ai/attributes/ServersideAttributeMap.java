package de.ropemc.api.wrapper.net.minecraft.entity.ai.attributes;

import java.util.Set;
import java.util.Collection;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.attributes.ServersideAttributeMap")
public interface ServersideAttributeMap {

    IAttributeInstance func_180376_c(IAttribute var0);

    void func_180794_a(IAttributeInstance var0);

    IAttributeInstance getAttributeInstance(IAttribute var0);

    IAttributeInstance getAttributeInstanceByName(String var0);

    Set getAttributeInstanceSet();

    Collection getWatchedAttributes();

    IAttributeInstance registerAttribute(IAttribute var0);

}
