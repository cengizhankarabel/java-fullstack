package com.karabel;

// var-args , Variable arguments , JDK 1.5

public class VarArgs_Ex {

    public static void main(String[] args) {

        //display1(12,13);
        display2("hi","hello");

    }

    public static void display1(int arg1,int arg2){
        System.out.println(arg1);
    }
    public static void display2(String...args){

//        System.out.println(args[0]);
//        System.out.println(args[1]);
//        System.out.println(args[2]);
//        System.out.println(args[3]);

        // way-1:
//        for (int i = 0; i < args.length; i++) {
//            int arg=args[i];
//            System.out.println(arg);
//        }
        //way-2:
        for(String v:args){
            System.out.println(v);
        }

    }

}