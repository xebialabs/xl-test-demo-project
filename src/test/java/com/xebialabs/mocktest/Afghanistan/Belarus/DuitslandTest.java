package com.xebialabs.mocktest.Afghanistan.Belarus;

import org.junit.Before;
import org.junit.Test;

import com.xebialabs.mocktest.One;

import static org.junit.Assert.assertTrue;

public class DuitslandTest {

    private One one;

    @Before
    public void setUp() {
        one = new One();
    }

    @Test
    public void testOne() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void testTwo() {
        assertTrue(one.random(1));
    }

    @Test
    public void testThree() {
        assertTrue(one.random(1));
    }

    @Test
    public void testFour() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void testFive() {
        assertTrue(one.random(1));
    }

    @Test
    public void testSix() {
        assertTrue(one.random(1));
    }

    @Test
    public void testSeven() {
        assertTrue(one.random(1));
    }

    @Test
    public void testEight() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void testNine() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void testTen() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void testEleven() {
        assertTrue(one.random(1));
    }

    @Test
    public void testTwelve() {
        assertTrue(one.random(1));
    }

    @Test
    public void testThirteen() {
        assertTrue(one.random(1));
    }

    @Test
    public void testFourteen() {
        assertTrue(one.succeeds());
    }

    @Test
    public void testFifteen() {
        assertTrue(one.random(0.95));
    }

}