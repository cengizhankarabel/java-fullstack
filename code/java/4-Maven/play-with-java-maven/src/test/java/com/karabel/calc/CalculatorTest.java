package com.karabel.calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator=new Calculator();

    @Test
    public void addTest(){
        int n1=25;
        int n2=25;
        int expected=50;
        int actual=calculator.add(n1,n2);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void subTest(){
        int n1=25;
        int n2=25;
        int expected=0;
        int actual=calculator.sub(n1,n2);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void mulTest(){
        int n1=25;
        int n2=25;
        int expected=625;
        int actual=calculator.mul(n1,n2);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void divTest(){
        int n1=25;
        int n2=0;
        Exception exception = Assertions.assertThrows(ArithmeticException.class, () ->
                calculator.div(n1, n2));
        Assertions.assertEquals("/ by zero", exception.getMessage());
    }

}