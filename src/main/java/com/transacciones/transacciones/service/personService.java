package com.transacciones.transacciones.service;

import com.transacciones.transacciones.repository.personRepository;
import com.transacciones.transacciones.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class personService {
    @Autowired
    private personRepository personRepository;

    public Person createPerson(Person person){
        return personRepository.save(person);
    }

    public List<Person> persons(){
        return (List<Person>) personRepository.findAll();
    }

    @Transactional
    public void createPersonDeclarativeWithRuntimeException(Person person){
        if (person.getAlias() == null){
            throw new DataIntegrityViolationException("It is impossible to save!");
        } else {
            personRepository.save(person);
        }
    }
}
