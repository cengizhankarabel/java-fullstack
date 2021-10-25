package com.karabel;

class Employee{
    private final int id;
    private final String name;
    public Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        //this.id = id;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        return new Employee(this.id,name);
    }
}

public class Immutable_Ex {
    public static void main(String[] args) {

        Employee employee1=new Employee(123,"Cengizhan");
        Employee employee2=employee1.setName("Karabel C");

        System.out.println(employee1==employee2);
        System.out.println(employee1.getName());
        System.out.println(employee2.getName());

    }
}
