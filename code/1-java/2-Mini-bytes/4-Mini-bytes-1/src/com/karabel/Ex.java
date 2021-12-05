package com.karabel;

public class Ex {
    public static void main(String[] args) {

        // Mutable string

        StringBuffer stringBuffer=new StringBuffer("a");
        stringBuffer.append("b");
        stringBuffer.append("c");
        stringBuffer.reverse();

        System.out.println(stringBuffer);


        StringBuilder stringBuilder=new StringBuilder("a");
        stringBuilder.append("b");
        stringBuilder.append("c");
        stringBuilder.reverse();

        System.out.println(stringBuilder);

    }
}