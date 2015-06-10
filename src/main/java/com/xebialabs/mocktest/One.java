package com.xebialabs.mocktest;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class One {
    private int counter = 0;
    private final Random random;
    private final boolean failureIsNotAnOption;

    public One() {
        random = new Random();
        failureIsNotAnOption = Boolean.getBoolean("succeed");
    }

    public One(int seed) {
        random = new Random(seed);
        failureIsNotAnOption = Boolean.getBoolean("succeed");
    }

    public boolean fails() {
        try {
            TimeUnit.MILLISECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false || failureIsNotAnOption;
    }

    public boolean succeeds() {
        try {
            TimeUnit.MILLISECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }

    public boolean random(double probability) {
        try {
            TimeUnit.MILLISECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return random.nextDouble() < probability || failureIsNotAnOption;
    }

    public boolean mod(int mod) {
        boolean result = counter % mod == 0;
        counter++;
        return result;
    }
}
