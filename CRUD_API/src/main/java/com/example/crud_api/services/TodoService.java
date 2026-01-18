package com.example.crud_api.services;

import com.example.crud_api.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public void displayTodo() {
        todoRepository.printTodo();
    }

}
