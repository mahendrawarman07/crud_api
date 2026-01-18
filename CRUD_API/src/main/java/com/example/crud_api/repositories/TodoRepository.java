package com.example.crud_api.repositories;

import org.springframework.stereotype.Component;

@Component
public class TodoRepository {

    public void printTodo() {
        System.out.println("This is Todo from Todo repository");
    }
}
