package de.ropemc.api.wrapper.net.minecraft.block.properties;

//import com.google.common.base.Predicate;
import java.util.Collection;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.properties.PropertyDirection")
public interface PropertyDirection {

    PropertyDirection create(String var0);

    //PropertyDirection create(String var0, Predicate var1);

    PropertyDirection create(String var0, Collection var1);

}
