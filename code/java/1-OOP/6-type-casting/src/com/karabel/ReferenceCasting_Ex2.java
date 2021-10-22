package com.karabel;

interface Vehicle{}

class Car implements Vehicle{ }
class Bike implements   Vehicle{}
class Lorry implements   Vehicle{

    void lorrySpecifBehav(){ }
}

class Mechanic{

//    public void doServiceForCar(Car car){
//
//    }
//    public void doServiceForBike(Bike bike){
//
//    }

    public void doService(Vehicle vehicle){
        if(vehicle instanceof Lorry){
            Lorry lorry=(Lorry) vehicle;
        }
    }

}

public class ReferenceCasting_Ex2 {
    public static void main(String[] args) {

        Mechanic mechanic=new Mechanic();

        Car car=new Car();
//        mechanic.doServiceForCar(car);
        mechanic.doService(car);



        Bike bike=new Bike();
//        mechanic.doServiceForBike(bike);
        mechanic.doService(bike);

        mechanic.doService(new Lorry());

    }
}