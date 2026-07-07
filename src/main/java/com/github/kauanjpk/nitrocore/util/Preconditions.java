package com.github.kauanjpk.nitrocore.util;

public final class Preconditions {

    private Preconditions() {}

    public static <T> T notNull(T object, String name) {

        if (object == null) {
            throw new IllegalArgumentException(name + " cannot be null.");
        }

        return object;
    }

}
