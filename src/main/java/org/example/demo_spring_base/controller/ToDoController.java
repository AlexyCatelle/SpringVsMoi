package org.example.demo_spring_base.controller;

import org.example.demo_spring_base.model.Todo;
import org.example.demo_spring_base.service.ToDoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/api")
public class ToDoController {

    private ToDoService toDoService;

    public ToDoController (ToDoService toDoService){this.toDoService = toDoService;};

    @GetMapping("/todo")
    @ResponseBody
    public Todo getFirstTodo(){
        return toDoService.getFirstTodo();
    }

    @GetMapping("/todos")
    @ResponseBody
    public List<Todo> getAllTodos() {
        return toDoService.getAllTodos();
    }

}
