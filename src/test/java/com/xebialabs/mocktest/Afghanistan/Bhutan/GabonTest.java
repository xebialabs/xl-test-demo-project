package com.xebialabs.mocktest.Afghanistan.Bhutan;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.xebialabs.mocktest.One;

import static org.testng.Assert.assertTrue;

public class GabonTest {
    private One one;

    @BeforeTest
    public void setUp() {
        one = new One();
    }

    @Test
    public void GabonOne() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void GabonTwo() {
        assertTrue(one.random(1));
    }

    @Test
    public void GabonThree() {
        assertTrue(one.random(1));
    }

    @Test
    public void GabonFour() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void GabonFive() {
        assertTrue(one.random(1));
    }

    @Test
    public void GabonSix() {
        assertTrue(one.random(1));
    }

    @Test
    public void GabonSeven() {
        assertTrue(one.random(1));
    }

    @Test
    public void GabonEight() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void GabonNine() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void GabonTen() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void GabonEleven() {
        assertTrue(one.random(1));
    }

    @Test
    public void GabonTwelve() {
        assertTrue(one.random(1));
    }

    @Test
    public void GabonThirteen() {
        assertTrue(one.random(1));
    }

    @Test
    public void GabonFourteen() {
        assertTrue(one.succeeds());
    }

    @Test
    public void GabonFifteen() {
        assertTrue(one.random(0.95));
    }

}