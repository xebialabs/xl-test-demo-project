package com.xebialabs.mocktest.Afghanistan.Bhutan;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.xebialabs.mocktest.One;

import static org.testng.Assert.assertTrue;

public class GhanaTest {
    private One one;

    @BeforeTest
    public void setUp() {
        one = new One();
    }

    @Test
    public void GhanaOne() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void GhanaTwo() {
        assertTrue(one.random(1));
    }

    @Test
    public void GhanaThree() {
        assertTrue(one.random(1));
    }

    @Test
    public void GhanaFour() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void GhanaFive() {
        assertTrue(one.random(1));
    }

    @Test
    public void GhanaSix() {
        assertTrue(one.random(1));
    }

    @Test
    public void GhanaSeven() {
        assertTrue(one.random(1));
    }

    @Test
    public void GhanaEight() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void GhanaNine() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void GhanaTen() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void GhanaEleven() {
        assertTrue(one.random(1));
    }

    @Test
    public void GhanaTwelve() {
        assertTrue(one.random(1));
    }

    @Test
    public void GhanaThirteen() {
        assertTrue(one.random(1));
    }

    @Test
    public void GhanaFourteen() {
        assertTrue(one.succeeds());
    }

    @Test
    public void GhanaFifteen() {
        assertTrue(one.random(0.95));
    }

}