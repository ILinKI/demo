package com.example.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "persons")
@NoArgsConstructor
@Data
public class Person {

    @Id
    private String id;
    private String name;
    private int age;

    // Getters and Setters
}

