package com.github.kauanjpk.nitrocore.optimization;

public interface Optimization {

    String getName();

    default void initialize() {}

    boolean isEnabled();

}
