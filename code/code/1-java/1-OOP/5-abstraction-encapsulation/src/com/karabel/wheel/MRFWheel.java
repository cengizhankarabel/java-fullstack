package com.karabel.wheel;

public class MRFWheel implements Wheel {

    @Override
    public int rotate(int speed) {
        System.out.println("MRF wheel rotating..");
        return speed*60;
    }
}
