package com.transacciones.transacciones.controller;

import com.transacciones.transacciones.service.personService;
import com.transacciones.transacciones.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class personController {
        @Autowired
        private personService personService;

        @GetMapping(value="/persons")
        public List<Person> persons(){return (List<Person>) personService.persons();}

        @PostMapping(value = "/persons")
        public void createPersonDeclarativeWithRuntimeException(@RequestBody Person person){
            personService.createPersonDeclarativeWithRuntimeException(person);
        }
    }
