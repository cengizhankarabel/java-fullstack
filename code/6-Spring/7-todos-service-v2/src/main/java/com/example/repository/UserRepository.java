package com.example.repository;

import com.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository   //@Component //optional annotation
public interface UserRepository extends JpaRepository<User, Integer> {

}
