package com.karabel;

import com.karabel.car.Car;
import com.karabel.wheel.CEATWheel;
import com.karabel.wheel.MRFWheel;

public class App {
    public static void main(String[] args) {

        MRFWheel mrfWheel = new MRFWheel();
        CEATWheel ceatWheel=new CEATWheel();
        Car car = new Car(mrfWheel);


        car.move(); //Polymorphism

    }
}
