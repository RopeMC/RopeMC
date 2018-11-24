package de.ropemc.api.wrapper.net.minecraft.block.state.pattern;

//import com.google.common.base.Predicate;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.state.pattern.FactoryBlockPattern")
public interface FactoryBlockPattern {

    FactoryBlockPattern aisle(String[] var0);

    BlockPattern build();

    void checkMissingPredicates();

    //Predicate[][][] makePredicateArray();

    FactoryBlockPattern start();

    //FactoryBlockPattern where(char var0, Predicate var1);

}
