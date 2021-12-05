package com.example;

import com.example.entity.Address;
import com.example.entity.AddressType;
import com.example.entity.Employee;

import javax.persistence.*;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public class Application {

    public static void main(String[] args) throws IOException {

        Employee employee=new Employee();
        employee.id =123;
        employee.name ="cengizhan";

        Address homeAddress= new Address();
        homeAddress.addressType= AddressType.HOME;
        homeAddress.city="Houston";
        homeAddress.country="Usa";

        Address officeAddress= new Address();
        officeAddress.addressType=AddressType.OFFICE;
        officeAddress.city="Ankara";
        officeAddress.country="Turkey";

        List<Address> addresses=List.of(
                homeAddress,
                officeAddress
        );

        employee.addresses=addresses;

//        employee.homeAddress=homeAddress;
//        employee.officeAddress=officeAddress;


        // insert this employee data into DB
        // using Hibernate / JPA api

        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("my-pu");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(employee); // insert into employee values(?,?)

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
