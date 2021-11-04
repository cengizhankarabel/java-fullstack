package com.karabel;

// Generics , New Syntax from JDK 1.5
/*
    why we need this syntax?
        => to create type-safety java objects
 */

interface Subject{}
class Java implements Subject{}
class Javascript implements Subject{}

// Generic Classes
class Trainer <T> {
    private T subject;
    public T getSubject() {
        return subject;
    }
    public void setSubject(T subject) {
        this.subject = subject;
    }
}


public class Application {

    public static void main(String[] args) {

        Trainer<Java> javaTrainer=new Trainer<Java>();
        javaTrainer.setSubject(new Java());

        Trainer<Javascript> javascriptTrainer=new Trainer<Javascript>();
        javascriptTrainer.setSubject(new Javascript());

        //------------------------------------------------
        // poor programmer
        //------------------------------------------------
//
//     javaTrainer.setSubject(new Javascript()); // compile-time Error, if we pollute
//     javascriptTrainer.setSubject(new Java());


        //---------------------------------------------
        // Java ClassRoom
        //---------------------------------------------

//     Subject javaSubject =javaTrainer.getSubject();
//     Java java=(Java)javaSubject;
        Java java=javaTrainer.getSubject();
        System.out.println("Happy Learning..with java");


        //---------------------------------------------
        // Javascript ClassRoom
        //---------------------------------------------

//    Subject javascriptSubject= javascriptTrainer.getSubject();
//    Javascript javascript=(Javascript) javascriptSubject;

        Javascript javascript=javascriptTrainer.getSubject();
//    System.out.println("Happy Learning..with javascript");


        //------------------------------------------



    }

}