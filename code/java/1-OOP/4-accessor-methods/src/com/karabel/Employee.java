package com.karabel;

public class Employee {

    private int id;
    private String name;
    private double salary;
    private String address;

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

    //accessor ( get-set) methods
    public int getId(){
        return this.id;
    }

    public void setName(String name){
        if(name!=null)
            this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary>0 && salary<100000.00)
            this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
