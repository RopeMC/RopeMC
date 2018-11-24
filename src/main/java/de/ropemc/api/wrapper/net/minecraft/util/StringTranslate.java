package de.ropemc.api.wrapper.net.minecraft.util;

import java.util.Map;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.StringTranslate")
public interface StringTranslate {

    StringTranslate getInstance();

    long getLastUpdateTimeInMilliseconds();

    boolean isKeyTranslated(String var0);

    void replaceWith(Map var0);

    String translateKey(String var0);

    String translateKeyFormat(String var0, Object[] var1);

    String tryTranslateKey(String var0);

}
