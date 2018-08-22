package de.example;

import org.junit.Assert;
import org.junit.Test;

public class GermanHelloTest {
    @Test
    public void testLang() {
        GermanHello hi =  new GermanHello();
        Assert.assertEquals("German", hi.getLanguage());
    }

}