/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mac
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    /**
     * Test of getDigito method, of class Calculadora.
     */
    @Test
    public void testGetDigito() {
        System.out.println("getDigito");
        Calculadora instance = new Calculadora();
        String expResult = "";
        String result = instance.getDigito();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDigito method, of class Calculadora.
     */
    @Test
    public void testSetDigito() {
        System.out.println("setDigito");
        String digito = "";
        Calculadora instance = new Calculadora();
        instance.setDigito(digito);
    }

    /**
     * Test of agregarNum method, of class Calculadora.
     */
    @Test
    public void testAgregarNum() {
        System.out.println("agregarNum");
        int num = 0;
        Calculadora instance = new Calculadora();
        instance.agregarNum(num);
        
    }

    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        String num = "";
        Calculadora instance = new Calculadora();
        instance.suma(num);
      
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        String num = "";
        Calculadora instance = new Calculadora();
        instance.resta(num);
        
    }

    /**
     * Test of multiplicacion method, of class Calculadora.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        String num = "";
        Calculadora instance = new Calculadora();
        instance.multiplicacion(num);
       
    }

    /**
     * Test of division method, of class Calculadora.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        String num = "";
        Calculadora instance = new Calculadora();
        instance.division(num);
        
    }

    /**
     * Test of calculo method, of class Calculadora.
     */
    @Test
    public void testCalculo() {
        System.out.println("calculo");
        String numero = "";
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.calculo(numero);
        assertEquals(expResult, result, 0);
        
    }
    
}
