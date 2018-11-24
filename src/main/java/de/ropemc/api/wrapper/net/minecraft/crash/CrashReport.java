package de.ropemc.api.wrapper.net.minecraft.crash;

import java.io.File;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.crash.CrashReport")
public interface CrashReport {

    CrashReportCategory getCategory();

    String getCauseStackTraceOrString();

    String getCompleteReport();

    Throwable getCrashCause();

    String getDescription();

    File getFile();

    void getSectionsInStringBuilder(StringBuilder var0);

    String getWittyComment();

    CrashReportCategory makeCategory(String var0);

    CrashReportCategory makeCategoryDepth(String var0, int var1);

    CrashReport makeCrashReport(Throwable var0, String var1);

    void populateEnvironment();

    boolean saveToFile(File var0);

}
