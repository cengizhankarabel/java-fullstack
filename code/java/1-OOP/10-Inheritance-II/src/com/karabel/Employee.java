package com.karabel;

public class Employee {

    private int id;
    private String name;

    public Employee(int id){
        if(id>0)
            this.id=id;
    }

    public int getId(){
        return this.id;
    }
}
