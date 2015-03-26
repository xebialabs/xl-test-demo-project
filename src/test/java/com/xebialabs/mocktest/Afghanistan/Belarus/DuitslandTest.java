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
    public void DuitslandOne() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void DuitslandTwo() {
        assertTrue(one.random(1));
    }

    @Test
    public void DuitslandThree() {
        assertTrue(one.random(1));
    }

    @Test
    public void DuitslandFour() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void DuitslandFive() {
        assertTrue(one.random(1));
    }

    @Test
    public void DuitslandSix() {
        assertTrue(one.random(1));
    }

    @Test
    public void DuitslandSeven() {
        assertTrue(one.random(1));
    }

    @Test
    public void DuitslandEight() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void DuitslandNine() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void DuitslandTen() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void DuitslandEleven() {
        assertTrue(one.random(1));
    }

    @Test
    public void DuitslandTwelve() {
        assertTrue(one.random(1));
    }

    @Test
    public void DuitslandThirteen() {
        assertTrue(one.random(1));
    }

    @Test
    public void DuitslandFourteen() {
        assertTrue(one.succeeds());
    }

    @Test
    public void DuitslandFifteen() {
        assertTrue(one.random(0.95));
    }

}