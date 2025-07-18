package org.example.demo_spring_base.model;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Product {
    private UUID id;
    private String name;
    private String description;
    private String category;
}
