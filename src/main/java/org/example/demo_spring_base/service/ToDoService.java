package org.example.demo_spring_base.service;

import org.example.demo_spring_base.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ToDoService {

    private final List<Todo> todos = new ArrayList<>();

    public ToDoService() {
            todos.add(Todo.builder()
                    .id(UUID.randomUUID())
                    .name("Acheter du pain")
                    .description("Aller à la boulangerie")
                    .isDone(false)
                    .build());

            todos.add(Todo.builder()
                    .id(UUID.randomUUID())
                    .name("Faire les devoirs")
                    .description("Maths et physique")
                    .isDone(true)
                    .build());
        }


    public List<Todo> getAllTodos() {
        return todos;
    }

    public Todo getFirstTodo() {
        return todos.isEmpty() ? null : todos.get(0);
    }
}
