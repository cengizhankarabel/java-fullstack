package com.karabel;

import com.karabel.god.God;
import com.karabel.live.Animal;
import com.karabel.live.Human;
import com.karabel.live.LivingThing;
import com.karabel.live.Robot;

import java.util.zip.Adler32;

public class LiveIT {
    public static void main(String[] args) {

        God god = new God();

        Human human = new Human();
        Animal animal=new Animal();
        Robot robot=new Robot();


        god.manageLT(human);
        System.out.println();
        god.manageLT(animal);
        System.out.println();
        god.manageLT(robot);
    }
}
