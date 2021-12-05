package com.karabel.car;

import com.karabel.wheel.Wheel;

public class Car {

    private Wheel wheel; // HAS-A

    public Car(Wheel wheel){
        this.wheel=wheel;
    }

    public void move(){
        int rpm=wheel.rotate(100);
        System.out.println("car moving : rpm "+rpm);
    }
}
