package com.karabel;


public class App {

    public static void main(String[] args){

        Employee employee1= new Employee(123);
        Employee employee2= new Employee(123,"Cengizhan Karabel");
        Employee employee3= new Employee(123,"Cengizhan Karabel",10000.00);

        System.out.println(employee1.name);
        System.out.println(employee2.name);
        System.out.println(employee3.name);
    }
}
