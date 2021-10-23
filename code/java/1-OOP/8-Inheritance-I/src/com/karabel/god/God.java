package com.karabel.god;

import com.karabel.live.Animal;
import com.karabel.live.Human;
import com.karabel.live.LivingThing;

public class God {
//    public void manageHuman(Human human){
//        human.eat();
//        human.sleep();
//        human.study();
//        human.work();
//    }
//    public void manageAnimal(Animal animal){
//        animal.eat();
//        animal.sleep();
//        animal.work();
//    }

    // principle: Open-Closed Principle => Dynamic Polymorphism
    public void manageLT(LivingThing livingThing){
        livingThing.eat();
        livingThing.sleep();

        // down-casting
        if(livingThing instanceof Human){
            Human human=(Human) livingThing;
            human.study();
        }

        livingThing.work();
    }
}
