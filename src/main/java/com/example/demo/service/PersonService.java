package com.example.demo.service;

import com.example.demo.model.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {
    List<Person> findAll();
    Optional<Person> findById(String id);
    Person save(Person person);
    void deleteById(String id);
}

