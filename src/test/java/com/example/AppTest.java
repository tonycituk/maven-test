package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testFraccionSimplificada()
    {
        Fraccion fraccA = new Fraccion(4,2);
        Fraccion fraccB = new Fraccion(2);
        assertTrue( (fraccA.getDen() == fraccB.getDen() && fraccA.getNum() == fraccB.getNum()) );
    }
}
