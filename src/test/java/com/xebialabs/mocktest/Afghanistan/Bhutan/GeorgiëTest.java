package com.xebialabs.mocktest.Afghanistan.Bhutan;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.xebialabs.mocktest.One;

import static org.testng.Assert.assertTrue;

public class GeorgiëTest {
    private One one;

    @BeforeTest
    public void setUp() {
        one = new One();
    }

    @Test
    public void GeorgieOne() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void GeorgieTwo() {
        assertTrue(one.random(1));
    }

    @Test
    public void GeorgieThree() {
        assertTrue(one.random(1));
    }

    @Test
    public void GeorgieFour() {
        assertTrue(one.random(1));
    }

    @Test
    public void GeorgieFive() {
        assertTrue(one.random(1));
    }

    @Test
    public void GeorgieSix() {
        assertTrue(one.random(1));
    }

    @Test
    public void GeorgieSeven() {
        assertTrue(one.random(1));
    }

    @Test
    public void GeorgieEight() {
        assertTrue(one.random(1));
    }

    @Test
    public void GeorgieNine() {
        assertTrue(one.random(1));
    }

    @Test
    public void GeorgieTen() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void GeorgieEleven() {
        assertTrue(one.random(1));
    }

    @Test
    public void GeorgieTwelve() {
        assertTrue(one.random(1));
    }

    @Test
    public void GeorgieThirteen() {
        assertTrue(one.random(1));
    }

    @Test
    public void GeorgieFourteen() {
        assertTrue(one.succeeds());
    }

    @Test
    public void GeorgieFifteen() {
        assertTrue(one.random(0.95));
    }

}