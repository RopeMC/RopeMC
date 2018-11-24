package de.ropemc.api.wrapper.net.minecraft.block.properties;

//import com.google.common.base.Predicate;
import java.util.Collection;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.properties.PropertyEnum")
public interface PropertyEnum {

    PropertyEnum create(String var0, Class var1);

    //PropertyEnum create(String var0, Class var1, Predicate var2);

    PropertyEnum create(String var0, Class var1, Collection var2);

    PropertyEnum create(String var0, Class var1, Enum[] var2);

    Collection getAllowedValues();

    String getName(Comparable var0);

    String getName(Enum var0);

}
