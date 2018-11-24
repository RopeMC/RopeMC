package de.ropemc.api.wrapper.net.minecraft.entity.ai.attributes;

//import com.google.common.collect.Multimap;
import java.util.Collection;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.attributes.BaseAttributeMap")
public interface BaseAttributeMap {

    //void applyAttributeModifiers(Multimap var0);

    IAttributeInstance func_180376_c(IAttribute var0);

    void func_180794_a(IAttributeInstance var0);

    Collection getAllAttributes();

    IAttributeInstance getAttributeInstance(IAttribute var0);

    IAttributeInstance getAttributeInstanceByName(String var0);

    IAttributeInstance registerAttribute(IAttribute var0);

    //void removeAttributeModifiers(Multimap var0);

}
