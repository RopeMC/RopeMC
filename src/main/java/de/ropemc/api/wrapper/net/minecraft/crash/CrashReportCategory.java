package de.ropemc.api.wrapper.net.minecraft.crash;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import java.util.concurrent.Callable;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.crash.CrashReportCategory")
public interface CrashReportCategory {

    void addBlockInfo(CrashReportCategory var0, BlockPos var1, Block var2, int var3);

    void addBlockInfo(CrashReportCategory var0, BlockPos var1, IBlockState var2);

    void addCrashSection(String var0, Object var1);

    void addCrashSectionCallable(String var0, Callable var1);

    void addCrashSectionThrowable(String var0, Throwable var1);

    void appendToStringBuilder(StringBuilder var0);

    boolean firstTwoElementsOfStackTraceMatch(StackTraceElement var0, StackTraceElement var1);

    String getCoordinateInfo(double var0, double var1, double var2);

    String getCoordinateInfo(BlockPos var0);

    int getPrunedStackTrace(int var0);

    StackTraceElement[] getStackTrace();

    void trimStackTraceEntriesFromBottom(int var0);

}
