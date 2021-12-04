package com.karabel;

import java.util.Scanner;

public class ArithmeticApp {
    public static void main(String[] args) {

        //
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter number-1");
        int n1= scanner.nextInt();

        System.out.println("Enter number-2");
        int n2= scanner.nextInt();

        //1-Add
        System.out.println("1-add");

        //2-Sub
        System.out.println("2-sub");

        //3-Div
        // Error Handling code
//        if(n2!=0) {
//            System.out.println("3-div");
//            int divResult = n1 / n2; // Regular Code
//        }else{
//            System.out.println("Number cannot be zero for division");
//        }

        try{
            System.out.println("3-div");
            int divResult = n1 / n2; // Regular Code , throw
        }catch (Exception e){
            System.out.println("Ex-"+e.getMessage());
        }

        //4-Mul
        System.out.println("4-Mul");

        System.out.println("All good");

    }
}