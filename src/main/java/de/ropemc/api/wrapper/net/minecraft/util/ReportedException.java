package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.net.minecraft.crash.CrashReport;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.ReportedException")
public interface ReportedException {

    CrashReport getCrashReport();

}
