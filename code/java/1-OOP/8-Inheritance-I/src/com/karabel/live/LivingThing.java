package com.karabel.live;

// Author : LivingTeam
// parent / super / base / generalized class

public abstract class LivingThing {
    public static void main(String[] args) {

    }
    public void eat(){
        System.out.println("LT: eat");
    }
    public final void sleep(){
        System.out.println("LT: sleep");
    }
    public abstract void work();

}
