package com.xebialabs.mocktest;

import java.util.Random;

public class One {
    private int counter = 0;
    private final Random random;

    public One() {
        random = new Random();
    }

    public One(int seed) {
        random = new Random(seed);
    }

    public boolean fails() {
        return false;
    }

    public boolean succeeds() {
        return true;
    }

    public boolean random(double probability) {
        return random.nextDouble() < probability;
    }

    public boolean mod(int mod) {
        boolean result = counter % mod == 0;
        counter++;
        return result;
    }
}
