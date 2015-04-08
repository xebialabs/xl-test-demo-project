package com.xebialabs.mocktest.Afghanistan.Bhutan;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.xebialabs.mocktest.One;

import static org.testng.Assert.assertTrue;

public class GibraltarTest {
    private One one;

    @BeforeTest
    public void setUp() {
        one = new One();
    }

    @Test
    public void GibraltarOne() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void GibraltarTwo() {
        assertTrue(one.random(1));
    }

    @Test
    public void GibraltarThree() {
        assertTrue(one.random(1));
    }

    @Test
    public void GibraltarFour() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void GibraltarFive() {
        assertTrue(one.random(1));
    }

    @Test
    public void GibraltarSix() {
        assertTrue(one.random(1));
    }

    @Test
    public void GibraltarSeven() {
        assertTrue(one.random(1));
    }

    @Test
    public void GibraltarEight() {
        assertTrue(one.random(1));
    }

    @Test
    public void GibraltarNine() {
        assertTrue(one.random(1));
    }

    @Test
    public void GibraltarTen() {
        assertTrue(one.random(1));
    }

    @Test
    public void GibraltarEleven() {
        assertTrue(one.random(1));
    }

    @Test
    public void GibraltarTwelve() {
        assertTrue(one.random(1));
    }

    @Test
    public void GibraltarThirteen() {
        assertTrue(one.random(1));
    }

    @Test
    public void GibraltarFourteen() {
        assertTrue(one.succeeds());
    }

    @Test
    public void GibraltarFifteen() {
        assertTrue(one.random(0.95));
    }

}