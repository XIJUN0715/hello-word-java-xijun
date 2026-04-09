package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
public class HelloWorldTest {
    @Test
    public void testGetGreeting() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello, World!", helloWorld.getGreeting()); //there are two different version if the assert equals compare to the Hello words there
    }
}
