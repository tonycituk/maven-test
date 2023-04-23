package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FraccionTest {


    @Test
    public void testSumarFraccion()
    {
        Fraccion fraccA = new Fraccion(4,2);
        Fraccion fraccB = new Fraccion(2);

        Fraccion resultado = fraccA.sumar(fraccB);
        assertEquals(resultado.getNum(), 4);
        assertEquals(resultado.getDen(), 1);
    }

    @Test
    public void testFraccionSimplificada()
    {
        Fraccion fraccA = new Fraccion(4,2);
        Fraccion fraccB = new Fraccion(2);
        assertTrue( (fraccA.getDen() == fraccB.getDen() && fraccA.getNum() == fraccB.getNum()) );
    }
}
