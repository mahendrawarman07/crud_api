package com.example.crud_api;

import com.example.crud_api.services.TodoService;

public class Main {
    public static void main(String[] args) {
        TodoService todoService = new TodoService();
        todoService.displayTodo();
    }
}
