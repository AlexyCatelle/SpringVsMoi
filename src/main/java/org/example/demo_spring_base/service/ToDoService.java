package org.example.demo_spring_base.service;

import org.example.demo_spring_base.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoService {

    private final List<Todo> todos = new ArrayList<>();

    public ToDoService() {
        todos.add(new Todo("Acheter du pain", "Aller à la boulangerie", false));
        todos.add(new Todo("Faire les devoirs", "Maths et physique", true));
    }

    public List<Todo> getAllTodos() {
        return todos;
    }

    public Todo getFirstTodo() {
        return todos.isEmpty() ? null : todos.get(0);
    }
}
