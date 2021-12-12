package com.example.repository;

import com.example.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo,Integer> {

    @Query("from Todo t where t.user.id=:userId")
    public List<Todo> findAllByUser(int userId);

}
