package com.example.web;

import com.example.entity.Todo;
import com.example.entity.TodoType;
import com.example.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

//@RestController
public class TodosController {


    //--------------------------------------------------------------------
    private static Map<Integer, Todo> in_memory_todos_db=new HashMap<>();
    static {
        in_memory_todos_db.put(1, new Todo(1,"todo-1", true, TodoType.HOME));
        in_memory_todos_db.put(2, new Todo(2,"todo-2", false, TodoType.OFFICE));
        in_memory_todos_db.put(3, new Todo(3,"todo-3", true, TodoType.OFFICE));
        in_memory_todos_db.put(4, new Todo(4,"todo-4", false, TodoType.OFFICE));
        in_memory_todos_db.put(5, new Todo(5,"todo-5", true, TodoType.HOME));

    }
    //--------------------------------------------------------------------
    // REST api endpoints
    // GET : /api/todos
    @RequestMapping(
            method = RequestMethod.GET,
            value="/api/todos",
            produces = {"application/json","application/xml"},
            params = {"type","!limit"}
    )
    public Collection<Todo> getAll(@RequestParam(name="type") String type){
        if(type==null){
            return in_memory_todos_db.values();
        }
        return in_memory_todos_db.values()
                .stream()
                .filter(todo->todo.getType().equals(TodoType.valueOf(type.toUpperCase())))
                .collect(Collectors.toList());
    }


    @RequestMapping(
            method = RequestMethod.GET,
            value="/api/todos",
            produces = {"application/json","application/xml"},
            params = {"type","limit"}
    )
    public Collection<Todo> getByLimit(
            @RequestParam(name="type") String type,
            @RequestParam(name="limit") int limit){
        return in_memory_todos_db.values()
                .stream()
                .filter(todo -> todo.getType().equals(TodoType.valueOf(type.toUpperCase())))
                .collect(Collectors.toList())
                .subList(0,limit);

    }

    //--------------------------------------------------------------------

    // GET : /api/todos/{todoId}
    @RequestMapping(
            method = RequestMethod.GET,
            value="/api/todos/{todoId}",
            produces = {"application/json"}
    )
    public ResponseEntity<?> get(@PathVariable(name = "todoId") int todoId){
        Todo todo=in_memory_todos_db.get(todoId);
        if(todo!=null)
            return ResponseEntity.ok(todo);
        else
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    //--------------------------------------------------------------------

    // POST : /api/todos
    @RequestMapping(
            method = RequestMethod.POST,
            value= "/api/todos",
            consumes = {"application/json", "application/xml"}
    )
    public ResponseEntity<?> post(@RequestBody Todo todo) {
        todo.setId(in_memory_todos_db.size()+1);
        in_memory_todos_db.put(in_memory_todos_db.size()+1, todo);
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
        Todo existingTodo=in_memory_todos_db.get(todoId);
        if(existingTodo==null) {
            todo.setId(todoId);
            in_memory_todos_db.put(todoId, todo);
            return ResponseEntity.status(HttpStatus.CREATED).body(todo);
        }
        else{
            existingTodo.setTitle(todo.getTitle());
            existingTodo.setCompleted(todo.isCompleted());
            return ResponseEntity.ok().build();
        }
    }
    //--------------------------------------------------------------------

    // DELETE : /api/todos/{todoId}

    @RequestMapping(
            method = RequestMethod.DELETE,
            value="/api/todos/{todoId}"
    )
    public ResponseEntity<?> delete(@PathVariable(name = "todoId") int todoId){
        in_memory_todos_db.remove(todoId);
    return ResponseEntity.ok().build();
    }


}
