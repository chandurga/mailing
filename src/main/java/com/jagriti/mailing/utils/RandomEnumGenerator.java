package com.jagriti.mailing.utils;

import java.util.Random;

public class RandomEnumGenerator <T extends Enum<T>> {
    private RandomEnumGenerator(){
        throw new IllegalStateException("Util class. Instance not allowed");
    }

    private static final Random PSEUDO_RANDOM_NUMBER_GENERATOR = new Random();

    private final T[] values;

    public RandomEnumGenerator(Class<T> e) {
        values = e.getEnumConstants();
    }

    public T randomEnum() {
        return values[PSEUDO_RANDOM_NUMBER_GENERATOR.nextInt(values.length)];
    }
}
