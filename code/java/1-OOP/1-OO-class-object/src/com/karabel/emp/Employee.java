
//package dec
package com.karabel.emp;

//import statements

//public class
public class Employee {

    // state a.k.a data

    // a. class-level data
    final static String COMPANY_NAME = "Revature";
    public static String tnrName; //null


    // b. object-level data
    public int id;
    public String name;

    // constructor
    public Employee(){} // default constructor

    // behavior

    // a. class-level behavior
    public static void doTraining(){
        System.out.println(tnrName+" doing training");
    }

    // b. object-level behavior
    public void doListenAndWork(){
        System.out.println(name+" Listening and working");
    }




}
