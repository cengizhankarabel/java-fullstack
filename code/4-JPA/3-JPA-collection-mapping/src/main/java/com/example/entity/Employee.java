package com.example.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name= "employees")
public class Employee {

    @Id
    public int id;
    public String name;

    @ElementCollection
    @CollectionTable(
            name="emp_addresses",
            foreignKey = @ForeignKey(name="id"))
    public List<Address> addresses;
//    @Embedded
//    public Address homeAddress;
//    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(name = "city", column = @Column(name="o_city")),
//                    @AttributeOverride( name = "country", column = @Column(name="o_country"))
//    })
//    public Address officeAddress;





}
