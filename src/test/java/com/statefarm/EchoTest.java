package com.statefarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EchoTest {

    @Test
    public void testShouldReturnsUpperCase(){
        //setup
        Echo echo = new Echo();
        //execution
        String result = echo.shout("hello");
        //assertion
        assertEquals("HELLO!", result);
    }

}
