package com.xebialabs.mocktest.reference;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
@Test
public class AllCombinedTestNg {

    @Test
    public void succeed() {
        assertTrue(true);
    }

    @Test(enabled = false)
    public void ignore() {

    }

    @Test
    public void willFail() {
        fail();
    }

    @Test
    public void failWithMessage() {
        assertThat(true, is(false));
    }

    @Test
    public void exceptionWithMessage() {
        throw new RuntimeException("Oeps");
    }

    @Test
    public void exceptionWithoutMessage() {
        throw new RuntimeException();
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void expectedException() {
        throw new IllegalArgumentException();
    }

    @Test
    public void throwError() {
        throw new InternalError();
    }

    @Test(timeOut = 10)
    public void timeOut() {
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {

        }
    }
}
