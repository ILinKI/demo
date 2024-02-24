package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public List<Person> getAllPersons() {
        return personService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Person> getPersonById(@PathVariable String id) {
        return personService.findById(id);
    }

    @PostMapping
    public Person createPerson(@RequestBody Person person) {
        return personService.save(person);
    }

    @PutMapping("/{id}")
    public Person updatePerson(@PathVariable String id, @RequestBody Person person) {
        return personService.save(person);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable String id) {
        personService.deleteById(id);
    }
}
