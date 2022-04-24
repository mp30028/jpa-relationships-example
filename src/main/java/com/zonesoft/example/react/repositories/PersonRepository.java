package com.zonesoft.example.react.repositories;

import org.springframework.data.repository.CrudRepository;

import com.zonesoft.example.react.entities.Person;

public interface PersonRepository extends  CrudRepository<Person, Long> {

}
