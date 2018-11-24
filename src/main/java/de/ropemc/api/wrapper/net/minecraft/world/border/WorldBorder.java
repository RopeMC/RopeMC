package de.ropemc.api.wrapper.net.minecraft.world.border;

import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.world.ChunkCoordIntPair;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.border.WorldBorder")
public interface WorldBorder {

    void addListener(IBorderListener var0);

    boolean contains(AxisAlignedBB var0);

    boolean contains(BlockPos var0);

    boolean contains(ChunkCoordIntPair var0);

    double getCenterX();

    double getCenterZ();

    double getClosestDistance(double var0, double var1);

    double getClosestDistance(Entity var0);

    double getDamageAmount();

    double getDamageBuffer();

    double getDiameter();

    List getListeners();

    double getResizeSpeed();

    int getSize();

    EnumBorderStatus getStatus();

    double getTargetSize();

    long getTimeUntilTarget();

    int getWarningDistance();

    int getWarningTime();

    double maxX();

    double maxZ();

    double minX();

    double minZ();

    void setCenter(double var0, double var1);

    void setDamageAmount(double var0);

    void setDamageBuffer(double var0);

    void setSize(int var0);

    void setTransition(double var0);

    void setTransition(double var0, double var1, long var2);

    void setWarningDistance(int var0);

    void setWarningTime(int var0);

}
