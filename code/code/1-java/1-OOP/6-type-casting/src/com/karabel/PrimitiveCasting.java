package com.karabel;

public class PrimitiveCasting {

    public static void main(String[] args) {

//
//        byte b=12;
//        short s=b; // implicit ( JRE do this conversion )
//        b=(byte)s; // explicit ( You do this conversion )


//        int i=456;
//        byte b=(byte)i;
//        System.out.println(b);


        for (int i = 0; i < 128; i++) {
            System.out.printf("%d -> %c \n",i,(char)i);
        }

        char c='A';
        int i=c;
        System.out.println(i);
    }
}