package com.karabel;

/*
 java.lang.Object
    .getClass()
    .hasCode()
    .equals()
    .clone()
    .wait()
    .notify()
    .notifyAll()
 */

class A{

}
class B extends A{

}

class Person{}

class Employee extends  Person  {

    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return id +" "+name+" "+salary;
    }


    // to compare 2 objects by data
    public boolean equals(Object obj) {
        if(obj instanceof Employee) {
            Employee e1 = this; // obj who calls .equals() method
            Employee e2 = (Employee) obj; // down-casting
            if (e1.id == e2.id && e1.name.equals(e2.name))
                return true;
            else
                return false;
        }else
            return false;
    }

}

class Customer{
    private int id;
    private String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }
}


public class ObjectClass_Ex {

    public static void main(String[] args) {

        Employee employee=new Employee(123,"Karabel",1000.00);


//        System.out.println(employee.getClass());
//        System.out.println(employee.hashCode());
//        System.out.println(employee.toString());


        Employee employee1=new Employee(1,"Emp1",100.00);
        Employee employee2=new Employee(1,"Emp1",200.00);

//        Customer customer1=new Customer(1,"Emp1");
//
//        System.out.println(employee1 == employee2); // true
        System.out.println(employee1.equals(employee2)); //


        /*
        why we need equals method
         use-cases
            => sorting
            => to find unique
         */


    }

}