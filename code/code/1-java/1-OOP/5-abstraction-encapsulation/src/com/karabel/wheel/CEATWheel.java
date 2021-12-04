package com.karabel.wheel;

public class CEATWheel implements Wheel{

    @Override
    public int rotate(int speed) {
        System.out.println("CEAT wheel rotating..");
        return speed*80;
    }
}
