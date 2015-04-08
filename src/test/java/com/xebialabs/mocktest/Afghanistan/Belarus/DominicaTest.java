package com.xebialabs.mocktest.Afghanistan.Belarus;

import org.junit.Before;
import org.junit.Test;

import com.xebialabs.mocktest.One;

import static org.junit.Assert.assertTrue;

public class DominicaTest {

    private One one;

    @Before
    public void setUp() {
        one = new One();
    }

    @Test
    public void dominicaOne() {
        assertTrue(one.random(1));
    }

    @Test
    public void dominicaTwo() {
        assertTrue(one.random(1));
    }

    @Test
    public void dominicaThree() {
        assertTrue(one.random(1));
    }

    @Test
    public void dominicaFour() {
        assertTrue(one.random(1));
    }

    @Test
    public void dominicaFive() {
        assertTrue(one.random(1));
    }

    @Test
    public void dominicaSix() {
        assertTrue(one.random(1));
    }

    @Test
    public void dominicaSeven() {
        assertTrue(one.random(1));
    }

    @Test
    public void dominicaEight() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void dominicaNine() {
        assertTrue(one.random(1));
    }

    @Test
    public void dominicaTen() {
        assertTrue(one.random(1));
    }

    @Test
    public void dominicaEleven() {
        assertTrue(one.random(0.5));
    }

    @Test
    public void dominicaTwelve() {
        assertTrue(one.random(1));
    }

    @Test
    public void dominicaThirteen() {
        assertTrue(one.random(1));
    }

    @Test
    public void dominicaFourteen() {
        assertTrue(one.succeeds());
    }

    @Test
    public void dominicaFifteen() {
        assertTrue(one.succeeds());
    }

}