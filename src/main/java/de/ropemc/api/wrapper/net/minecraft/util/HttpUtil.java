package de.ropemc.api.wrapper.net.minecraft.util;

//import org.apache.logging.log4j.Logger;
import java.util.Map;
import java.io.File;
import java.net.Proxy;
//import com.google.common.util.concurrent.ListenableFuture;
import java.net.URL;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.HttpUtil")
public interface HttpUtil {

    //Logger access$000();

    String buildPostString(Map var0);

    //ListenableFuture downloadResourcePack(File var0, String var1, Map var2, int var3, IProgressUpdate var4, Proxy var5);

    String get(URL var0);

    int getSuitableLanPort();

    String post(URL var0, String var1, boolean var2);

    String postMap(URL var0, Map var1, boolean var2);

}
