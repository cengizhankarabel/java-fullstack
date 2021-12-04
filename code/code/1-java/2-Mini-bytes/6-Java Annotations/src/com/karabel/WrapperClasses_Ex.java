package com.karabel;

/*
    data types
    1. primitives ==> values
    2. reference  ==> objects
 */

// is java complete OOP ? No , because of primitives

import java.util.ArrayList;

class Employee{}

public class WrapperClasses_Ex {
    public static void main(String[] args) {

        int i=12; // value

        Integer integer1=new Integer(i);
        Integer integer2=i; //  auto-boxing   ( JDK 1.5 )

        // to hold primitives in java's collections

        ArrayList<Integer> numberList=new ArrayList<Integer>();
//        numberList.add(new Integer(12));
        numberList.add(12);

        //------------------------------------------------------------


        Integer i1=123;
        Integer i2=123;

        int sum1=i1.intValue()+i2.intValue(); //
        int sum2=i1+i2; // auto-unboxing

        //-----------------------------------------------------------------



        int primitiveInt=123; // stack
//        Integer integerObject=new Integer(primitiveInt);
        // from JDK 1.5
        Integer integerObject=primitiveInt; // auto boxing

//        int intV=integerObject.intValue();

        // from JDK 1.5
        int intV=integerObject; // auto un-boxing

        //--------------------------------------------------------------------



        byte b=123;
        Byte aByte=new Byte((byte)123);

        byte b1=aByte;


        //-------------------------------------------------------------------


        int ch='a';

        boolean isThisDigit=Character.isDigit(ch);
        System.out.println(isThisDigit);

        boolean isThisUpper=Character.isUpperCase(ch);
        System.out.println(isThisUpper);

        //----------------------------------------------------------------------

        //8421
        int number=12; // binary : 1100
        System.out.println(Integer.toBinaryString(number));
        System.out.println(Integer.toHexString(number));

        //----------------------------------------------------------------------




    }
}