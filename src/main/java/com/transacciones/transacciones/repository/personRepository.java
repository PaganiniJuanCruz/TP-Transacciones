package com.transacciones.transacciones.repository;

import com.transacciones.transacciones.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface personRepository extends JPARepository<Person, Long> {
}
