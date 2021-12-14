package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private String email;
    private String password;
    private String name;
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name="user_roles", foreignKey = @ForeignKey(name="user_id"))
    private List<String> authorities;

}
