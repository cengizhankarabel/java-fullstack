package com.karabel.you;

import com.karabel.me.Greet;

public class ArabicGreetingComponent {

    @Greet // describes your method, giving signal to F.W invoke on greeting
    public void hello(){
        System.out.println("Marhaban");
    }


}