package com.example.web;

import com.example.entity.Todo;

import com.example.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;


@RestController
public class NewTodosController {

    @Autowired
    private TodoRepository todoRepository;


    //--------------------------------------------------------------------
    // REST api endpoints
    // GET : /api/todos

    @RequestMapping(
            method = RequestMethod.GET,
            value="/api/todos",
            produces = {"application/json","application/xml"}
    )
    public Collection<Todo> getAll(){

        Collection<Todo> todos = todoRepository.findAll();
        return todos;
    }


    //--------------------------------------------------------------------

    // GET : /api/todos/{todoId}

    @RequestMapping(
            method = RequestMethod.GET,
            value="/api/todos/{todoId}",
            produces = {"application/json"}
    )
    public ResponseEntity<?> get(@PathVariable(name = "todoId") int todoId){
        Optional<Todo> optionalTodo = todoRepository.findById(todoId);
        if(optionalTodo.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(optionalTodo.get());
    }

    //--------------------------------------------------------------------

    // POST : /api/todos

    @RequestMapping(
            method = RequestMethod.POST,
            value= "/api/todos",
            consumes = {"application/json", "application/xml"}
    )
    public ResponseEntity<?> post(@RequestBody Todo todo) {
        todo=todoRepository.save(todo); // insert
        return ResponseEntity.status(HttpStatus.CREATED).body(todo);
    }

    //--------------------------------------------------------------------

    // PUT : /api/todos/{todoId}

    @RequestMapping(
            method = RequestMethod.PUT,
            value = "/api/todos/{todoId}"
    )
    public ResponseEntity<?> put(
            @PathVariable(name = "todoId")int todoId,
            @RequestBody Todo todo

    ){
        todo.setId(todoId);
        todo=todoRepository.save(todo); // update
        return ResponseEntity.ok(todo);
        }

    //--------------------------------------------------------------------

    // DELETE : /api/todos/{todoId}

    @RequestMapping(
            method = RequestMethod.DELETE,
            value="/api/todos/{todoId}"
    )
    public ResponseEntity<?> delete(@PathVariable(name = "todoId") int todoId){
        todoRepository.deleteById(todoId); // delete from todos where id=?
        return ResponseEntity.ok().build();
    }

}
