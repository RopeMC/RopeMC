package de.ropemc.api.inject;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Inject {
    //the mcp wrapper class
    Class<?> value();

    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    @interface Start {}

    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    @interface End {}

    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    @interface At {
        int value();
    }
}
