package com.example.crud_api.controllers;

import com.example.crud_api.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping
    public String greet() {
        todoService.displayTodo();
        return "Hello from TodoController!";
    }

    @GetMapping("/{todoId}")
    public String getTodoById(@PathVariable("todoId") int id){
        return id +" is a TODO item.";
    }

    @GetMapping("/create")
    public String createUser(@RequestParam("userName") String userName, @RequestParam("password") String password){
        return "Create TODO API called with the userName: " + userName + " and password: " + password;
    }

    @GetMapping("/createUser")
    public String getUserById(@RequestBody String body){
        return "Create TODO API called with the body by GET Method: " + body;
    }

    @PostMapping("/createUser")
    public String postUserByIdByPost(@RequestBody String body){
        return "Create TODO API called with the body by POST Method: " + body;
    }

    @PutMapping("/createUser")
    public String puttUserByIdByPost(@RequestBody String body){
        return "Create TODO API called with the body by PUT Method: " + body;
    }

    @DeleteMapping("/createUser")
    public String deleteUserByIdByPost(@RequestBody String body){
        return "Create TODO API called with the body by DELETE Method: " + body;
    }
}
