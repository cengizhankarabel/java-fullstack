package com.karabel;

import java.io.IOException;
import java.io.InputStreamReader;

public class Checked_UnChecked_Ex2 {
    public static void main(String[] args) {

        int n1=12;
        int n2=0;
        int result = n1 / n2;

        //----------------------------------------------------

        InputStreamReader isr=new InputStreamReader(System.in);
        try {
            isr.read();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}