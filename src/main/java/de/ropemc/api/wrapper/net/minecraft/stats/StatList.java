package de.ropemc.api.wrapper.net.minecraft.stats;

import de.ropemc.api.wrapper.net.minecraft.item.Item;
//import de.ropemc.api.wrapper.net.minecraft.entity.EntityList$EntityEggInfo;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.stats.StatList")
public interface StatList {

    String func_180204_a(Item var0);

    StatBase getOneShotStat(String var0);

    //StatBase getStatEntityKilledBy(EntityList$EntityEggInfo var0);

    //StatBase getStatKillEntity(EntityList$EntityEggInfo var0);

    void init();

    void initCraftableStats();

    void initItemDepleteStats();

    void initMiningStats();

    void initStats();

    void mergeStatBases(StatBase[] var0, Block var1, Block var2);

    void replaceAllSimilarBlocks(StatBase[] var0);

}
