package com.xebialabs.mocktest.Afghanistan.Belarus;

import org.junit.Before;
import org.junit.Test;

import com.xebialabs.mocktest.One;

import static org.junit.Assert.assertTrue;

public class DjiboutiTest {

    private One one;

    @Before
    public void setUp() {
        one = new One();
    }

    @Test
    public void djiboutiOne() {
        assertTrue(one.random(1));
    }

    @Test
    public void djiboutiTwo() {
        assertTrue(one.fails());
    }

    @Test
    public void djiboutiThree() {
        assertTrue(one.random(1));
    }

    @Test
    public void djiboutiFour() {
        assertTrue(one.random(0.95));
    }

    @Test
    public void djiboutiFive() {
        assertTrue(one.random(1));
    }

    @Test
    public void djiboutiSix() {
        assertTrue(one.random(1));
    }

    @Test
    public void djiboutiSeven() {
        assertTrue(one.random(1));
    }

    @Test
    public void djiboutiEight() {
        assertTrue(one.random(1));
    }

    @Test
    public void djiboutiNine() {
        assertTrue(one.random(1));
    }

    @Test
    public void djiboutiTen() {
        assertTrue(one.random(1));
    }

    @Test
    public void djiboutiEleven() {
        assertTrue(one.random(1));
    }

    @Test
    public void djiboutiTwelve() {
        assertTrue(one.random(1));
    }

    @Test
    public void djiboutiThirteen() {
        assertTrue(one.random(1));
    }

    @Test
    public void djiboutiFourteen() {
        assertTrue(one.succeeds());
    }

    @Test
    public void djiboutiFifteen() {
        assertTrue(one.succeeds());
    }

}