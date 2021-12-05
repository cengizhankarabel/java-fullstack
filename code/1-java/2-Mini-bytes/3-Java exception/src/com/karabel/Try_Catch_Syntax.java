package com.karabel;

class Employee{
    public void doWork(){
        System.out.println("work()");
    }
}

public class Try_Catch_Syntax {

    public static void main(String[] args) {

        System.out.println("A");

        try{
            System.out.println("B");
            // arith work
            int divResult=1/1;
            // array work
            int[] numbers={10,20,30};
            System.out.println(numbers[10]);
            // obj's work
            Employee employee=null;
            employee.doWork();
            System.out.println("C");
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            // log that message in console
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("D3");
        }

        System.out.println("E");

    }

}