package com.xebialabs.mocktest.Afghanistan.Belarus;


import org.junit.Before;
import org.junit.Test;

import com.xebialabs.mocktest.One;

import static org.junit.Assert.assertTrue;

public class DenemarkenTest {
    private One one;

    @Before
    public void setUp() {
        one = new One();
    }

    @Test
    public void denemarkenOne() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void denemarkenTwo() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void denemarkenThree() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void denemarkenFour() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void denemarkenFive() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void denemarkenSix() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void denemarkenSeven() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void denemarkenEight() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void denemarkenNine() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void denemarkenTen() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void denemarkenEleven() {
        assertTrue(one.random(0.5));
    }

    @Test
    public void denemarkenTwelve() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void denemarkenThirteen() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void denemarkenFourteen() {
        assertTrue(one.succeeds());
    }

    @Test
    public void denemarkenFifteen() {
        assertTrue(one.random(0.95));
    }

}