package de.ropemc.api.wrapper.net.minecraft.util;

import java.util.Random;
import java.util.UUID;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.MathHelper")
public interface MathHelper {

    float abs(float var0);

    int abs_int(int var0);

    double abs_max(double var0, double var1);

    double average(long[] var0);

    int bucketInt(int var0, int var1);

    int calculateLogBaseTwo(int var0);

    int calculateLogBaseTwoDeBruijn(int var0);

    int ceiling_double_int(double var0);

    int ceiling_float_int(float var0);

    double clamp_double(double var0, double var1, double var2);

    float clamp_float(float var0, float var1, float var2);

    int clamp_int(int var0, int var1, int var2);

    float cos(float var0);

    double denormalizeClamp(double var0, double var1, double var2);

    boolean epsilonEquals(float var0, float var1);

    int floor_double(double var0);

    long floor_double_long(double var0);

    int floor_float(float var0);

    int func_154353_e(double var0);

    int func_154354_b(int var0, int var1);

    int func_180181_b(int var0, int var1, int var2);

    int func_180183_b(float var0, float var1, float var2);

    int func_180188_d(int var0, int var1);

    double func_181159_b(double var0, double var1);

    double func_181160_c(double var0, double var1, double var2);

    double func_181161_i(double var0);

    double func_181162_h(double var0);

    int func_181758_c(float var0, float var1, float var2);

    long getCoordinateRandom(int var0, int var1, int var2);

    long getPositionRandom(Vec3i var0);

    double getRandomDoubleInRange(Random var0, double var1, double var2);

    int getRandomIntegerInRange(Random var0, int var1, int var2);

    UUID getRandomUuid(Random var0);

    boolean isPowerOfTwo(int var0);

    int normalizeAngle(int var0, int var1);

    double parseDoubleWithDefault(String var0, double var1);

    double parseDoubleWithDefaultAndMax(String var0, double var1, double var2);

    int parseIntWithDefault(String var0, int var1);

    int parseIntWithDefaultAndMax(String var0, int var1, int var2);

    float randomFloatClamp(Random var0, float var1, float var2);

    int roundUpToPowerOfTwo(int var0);

    float sin(float var0);

    float sqrt_double(double var0);

    float sqrt_float(float var0);

    int truncateDoubleToInt(double var0);

    double wrapAngleTo180_double(double var0);

    float wrapAngleTo180_float(float var0);

}
