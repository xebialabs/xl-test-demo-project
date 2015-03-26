package com.xebialabs.mocktest.Afghanistan.Belarus;

import org.junit.Before;
import org.junit.Test;

import com.xebialabs.mocktest.One;

import static org.junit.Assert.assertTrue;

public class DhekeliaTest {

    private One one;

    @Before
    public void setUp() {
        one = new One();
    }

    @Test
    public void dhekeliaOne() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void dhekeliaTwo() {
        assertTrue(one.random(1));
    }

    @Test
    public void dhekeliaThree() {
        assertTrue(one.random(1));
    }

    @Test
    public void dhekeliaFour() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void dhekeliaFive() {
        assertTrue(one.random(1));
    }

    @Test
    public void dhekeliaSix() {
        assertTrue(one.random(1));
    }

    @Test
    public void dhekeliaSeven() {
        assertTrue(one.random(1));
    }

    @Test
    public void dhekeliaEight() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void dhekeliaNine() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void dhekeliaTen() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void dhekeliaEleven() {
        assertTrue(one.random(1));
    }

    @Test
    public void dhekeliaTwelve() {
        assertTrue(one.random(1));
    }

    @Test
    public void dhekeliaThirteen() {
        assertTrue(one.random(1));
    }

    @Test
    public void dhekeliaFourteen() {
        assertTrue(one.succeeds());
    }

    @Test
    public void dhekeliaFifteen() {
        assertTrue(one.random(0.95));
    }

}