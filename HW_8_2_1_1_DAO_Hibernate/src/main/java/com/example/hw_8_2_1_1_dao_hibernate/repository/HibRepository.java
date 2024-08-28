package com.example.hw_8_2_1_1_dao_hibernate.repository;

import com.example.hw_8_2_1_1_dao_hibernate.base.Person;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public class HibRepository {
    PersonRepository repository;

    public HibRepository(PersonRepository repository){
        this.repository = repository;
    }

    @Transactional
    public List<Person> findAllByCity_of_living(String city){
        return repository.findAllByCity_of_living(city);
    }
    @Transactional
    public List<Person> findAllByAgeLessThan (int age){
        return repository.findAllByAgeLessThan(age);
    }
    @Transactional
    public List<Optional<Person>> findAllByNameAndSurname (String name, String surname){
        return repository.findAllByNameAndSurname(name, surname);
    }
}
