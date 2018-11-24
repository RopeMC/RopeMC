package de.ropemc.api.wrapper.net.minecraft.util;

import java.util.Map;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.ClassInheritanceMultiMap")
public interface ClassInheritanceMultiMap {

    //Map access$000(ClassInheritanceMultiMap var0);

    void createLookup(Class var0);

    Class func_181157_b(Class var0);

    void func_181743_a(Object var0, Class var1);

    Iterable getByClass(Class var0);

}
