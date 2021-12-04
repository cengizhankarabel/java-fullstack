package com.karabel;


public class App {

    public static void main(String[] args){

        Employee employee= new Employee(123);
        employee.setName("Cengizhan Karabel");
        employee.setSalary(90000.00);
        employee.setAddress("Houston/TX");


        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        System.out.println(employee.getAddress());

    }
}
