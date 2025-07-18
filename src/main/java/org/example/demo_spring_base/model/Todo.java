package org.example.demo_spring_base.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Todo {
    private String name;
    private String description;
    private boolean isDone;
}
