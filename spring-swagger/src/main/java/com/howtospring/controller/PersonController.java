package com.howtospring.controller;

import com.howtospring.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    @GetMapping("/{id}")
    private Person getPerson(@PathVariable long id){
        Person person = new Person(id, "David", 23);
        return person;
    }
}
