package com.bridgelabz_junit;

import org.junit.Test;
import static org.junit.Assert.*;
public class TestDemo{
    @Test
    public void celciusToFereheitConversion(){

        Util tc = new Util();
        assertEquals(31,tc.FahrenheitToCelsius(87.8),0.0);
    }
}