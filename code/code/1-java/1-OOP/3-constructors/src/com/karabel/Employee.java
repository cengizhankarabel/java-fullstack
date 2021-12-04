package com.karabel;

public class Employee {

    public int id;
    public String name;
    public double salary;
    public String address;

    public Employee(int id){
        this(id,"Anonymous",0);
    }
    public Employee(int id,String name){
        this(id,name,0);
    }

    public Employee(int id,String name, double salary){
        if(id>0)
            this.id=id;
        if(name!=null)
            this.name=name;
        this.salary=salary;
    }
}
