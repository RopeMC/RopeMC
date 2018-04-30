package de.ropemc.utils.wrapper;


import de.ropemc.Mappings;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MinecraftVersion
{
    Mappings.MCVersion[] value();
}