/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadora;

import java.util.stream.Stream;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


/**
 *
 * @author SUSANA
 */

public class CalculadoraTest { 
 
   @Test
    public void testSuma() {
        Calculadora instance = new Calculadora(20,10);
        int expResult = 30;
        int result = instance.suma();
        assertEquals(expResult, result);
        
    }
    
       /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
       Calculadora instance = new Calculadora(20,10);
        int expResult = 10;
        int result = instance.resta();
        assertEquals(expResult, result);
    }

    /**
     * Test of multiplica method, of class Calculadora.
     */
    @Test
    public void testMultiplica() {
        Calculadora instance = new Calculadora(20,10);
        int expResult = 200;
        int result = instance.multiplica();
        assertEquals(expResult, result);
    }

    /**
     * Test of divide method, of class Calculadora.
     */
    @Test
    
    public void testDivide() {
       Calculadora instance = new Calculadora(20,10);
        int expResult = 2;
        int result = instance.divide();
        assertEquals(expResult, result);
    }

    /**
     * Test of resta2 method, of class Calculadora.
     */
    @Test
    public void testResta2() {
        Calculadora instance = new Calculadora(20,10);
        boolean result = instance.resta2();
        assertTrue(result);
    }

    /**
     * Test of divide2 method, of class Calculadora.
     */
    @Test
    public void testDivide2() {
        Calculadora instance = new Calculadora(10,0);
        Integer result = instance.divide2();
        assertNull(result);
        
    }

    /**
     * Test of divide0 method, of class Calculadora.
     */
  /* @Test()
    public void testDivide0() {
        Calculadora c = new Calculadora(10,10);
        try{
            c.divide0();
        }catch(ArithmeticException e){
             assertEquals("/ by zero", e.getMessage());
        }
 
    }*/
    
   @Test()
    public void testDivide0(){
        Calculadora c = new Calculadora(10,0);
        assertThrows(ArithmeticException.class, new Executable(){
            public void execute() throws Throwable{
                c.divide0();
            }
        });
    }
   /* public void testDivide0() {
         Calculadora c = new Calculadora(10,0);
         assertThrows(ArithmeticException.class,() -> c.divide0());
    }*/
    

    
}
