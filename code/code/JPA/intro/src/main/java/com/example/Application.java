package com.example;

import com.example.entity.Employee;
import com.example.entity.Gender;

import javax.persistence.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

public class Application {

    public static void main(String[] args) throws IOException {

        Employee employee=new Employee();
        employee.setId(128);
        employee.setName("Cengizhan");
        employee.setGender(Gender.MALE);
        employee.setDob(new Date());
        employee.setProfile("profile..");

//        File file=new File ("C:/Users/cengi/Desktop/Yeni_klasor2/20092007(002).jpg");
//        byte[] pic=new byte[(int)file.length()];
//        FileInputStream fis=new FileInputStream(file);
//        fis.read(pic);
//        fis.close();
//        employee.setProfilePic(pic);

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
