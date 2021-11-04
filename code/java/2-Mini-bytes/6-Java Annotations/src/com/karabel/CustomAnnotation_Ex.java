package com.karabel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;



class Calculator {
    public int add(int x, int y) {
        return x + y;
    }

    public int sub(int x, int y) {
        return x - y;
    }
    public int mul(int x, int y) {
        return x * y;
    }
}




class CalculatorTestCase {

    Calculator calculator = new Calculator();

    // Testing => AAA process
    // A ==> Arrange
    // A ==> Act
    // A ==> Assert

    // Test method
    @NagTest
    public void addTest() {
        // Arrange
        int x = 12;
        int y = 13;
        int expected = 25;
        // Act
        int actual = calculator.add(x, y);
        //Assert
        if (expected == actual) {
            System.out.println("addTest Pass");
        } else {
            System.out.println("addTest Fail");
        }
    }

    // Test method
    @NagTest
    public void subTest() {
        int x = 12;
        int y = 13;
        int expected = -1;
        int actual = calculator.sub(x, y);
        if (expected == actual) {
            System.out.println("subTest Pass");
        } else {
            System.out.println("subTest Fail");
        }
    }
    // Test method
    @NagTest
    public void mulTest() {
        int x = 12;
        int y = 12;
        int expected = 144;
        int actual = calculator.mul(x, y);
        if (expected == actual) {
            System.out.println("mulTest Pass");
        } else {
            System.out.println("mulTest Fail");
        }
    }

}


//----------------------------------------------------------------
// Testing Library  , Author : Cengizhan              ,     Junit
//----------------------------------------------------------------

/*
    design issues
    => testing library tightly-coupled with specific test-case & test-method(s)
 */

@Retention(RetentionPolicy.RUNTIME)
@interface NagTest{}

// invoke all test-methods from any test-case

class NagTestingLibrary {
    public void runTests() throws InvocationTargetException, IllegalAccessException {
        CalculatorTestCase calculatorTestCase = new CalculatorTestCase();
        /*
            => we can detect annotation at class-level using 'Reflection' api
         */
        Class clazz=calculatorTestCase.getClass(); // every .class in JVM is an object whose type is 'Class'
        Method[] methods=clazz.getMethods();
        for(Method method:methods){
            NagTest nagTest=method.getAnnotation(NagTest.class);
            if(nagTest!=null){
                method.invoke(calculatorTestCase, new Object[]{});
            }
        }
    }
}


public class CustomAnnotation_Ex {
    public static void main(String[] args) {

        NagTestingLibrary nagTestingLibrary = new NagTestingLibrary();

        try {

            nagTestingLibrary.runTests();

        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }
}