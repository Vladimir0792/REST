package com.demoTravis;

import com.demoTravis.Travis;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert.*;


public class TravisTest {
    private Travis travis;

    @Before
    public void load() {
        travis = new Travis();
    }

    @Test
    public void shouldBigger() {
        assertTrue(travis.isInt(40, 33));
    }

    @Test
    public void shouldNotBigger() {
        assertFalse(travis.isInt(25,
                25));
    }

    @Test
    public void shouldEquals() {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));

        Travis.travis(null);

        System.setOut(consoleStream);

        String actual = byteArrayOutputStream.toString();
        String expected = "Hello world!" + System.lineSeparator() +
                "true" + System.lineSeparator();

        assertEquals(expected, actual);
    }

}
