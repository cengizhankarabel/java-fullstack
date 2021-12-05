package com.karabel.you;

import com.karabel.me.Greet;

public class EnglishGreetingComponent {

    @Greet // describes your method, giving signal to F.W invoke on greeting
    public void hello(){
        System.out.println("Hello");
    }

    @Greet
    public void hi(){
        System.out.println("Hi");
    }

    public void hey(){
        System.out.println("Hey");
    }

}