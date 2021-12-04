package com.karabel;

import java.util.ArrayList;

class GiftBoxEmptyException extends  Exception{
    public GiftBoxEmptyException(String message) {
        super(message);
    }
}

class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void surprise(ArrayList giftBox) throws GiftBoxEmptyException{
        if(giftBox.isEmpty()){
            throw new GiftBoxEmptyException("expecting at least one gift");
        }
        System.out.println(this.name+" happy with gift box");
    }

}

public class Ex2 {
    public static void main(String[] args) {

        Person person=new Person("Karabel");

        ArrayList giftBox=new ArrayList();

        try {
            person.surprise(giftBox);
        } catch (GiftBoxEmptyException e) {
            System.out.println("oops, on that");
        }

    }
}