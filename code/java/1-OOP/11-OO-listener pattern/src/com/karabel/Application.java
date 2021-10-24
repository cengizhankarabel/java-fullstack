package com.karabel;

/*

        Room
            Door
                open()
                close()

            Light
                on()
                off()



 */

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

interface DoorListener{
    void on();
    void off();
}

class Light implements DoorListener{
    public void on(){
        System.out.println("Light ON");
    }

    public void off(){
        System.out.println("Light OFF");
    }
}

class Fan implements DoorListener{
    public void on(){
        System.out.println("Fan ON");
    }

    public void off(){
        System.out.println("Fan OFF");
    }
}

/*
    door Module
        => 'open' for extension
        => 'closed' for modification
 */


class Door{

    private ArrayList<DoorListener> doorListeners=new ArrayList<>(); // array

    public void addDoorListener(DoorListener doorListener){
        doorListeners.add(doorListener);
    }

    public void open(){
        System.out.println("door opened");
        for(DoorListener doorListener:doorListeners){
            doorListener.on();
        }
    }
    public void close(){
        System.out.println("Door Closed");
        for(DoorListener doorListener:doorListeners){
            doorListener.off();
        }
    }
}

public class Application {
    public static void main(String[] args) throws Exception {

        Door door=new Door();

        Light light=new Light();
        Fan fan=new Fan();

        door.addDoorListener(light);
        door.addDoorListener(fan);

        TimeUnit.SECONDS.sleep(3);
        door.open();
        TimeUnit.SECONDS.sleep(3);
        door.close();

    }
}
