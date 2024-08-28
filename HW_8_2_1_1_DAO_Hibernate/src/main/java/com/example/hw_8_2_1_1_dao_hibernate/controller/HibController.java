package com.example.hw_8_2_1_1_dao_hibernate.controller;

import com.example.hw_8_2_1_1_dao_hibernate.base.Person;
import com.example.hw_8_2_1_1_dao_hibernate.service.HibService;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.security.RolesAllowed;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/persons")
public class HibController {
    public HibService service;
    public HibController (HibService service){
        this.service = service;
    }

    @Secured("ROLE_READ")
    @GetMapping("/by-city")
    public List<Person> personsByCity(@RequestParam("city") String city){
        return service.findAllByCity_of_living(city);
    }
    @RolesAllowed("ROLE_WRITE")
    @GetMapping("/by-lessAge")
    public List<Person> findAllByAgeLessThan (@RequestParam("age") int age){
        return service.findAllByAgeLessThan(age);
    }
    @PostAuthorize("hasRole('ROLE_WRITE') or hasRole('ROLE_DELETE')")
    @GetMapping("/by-name-surname")
    List<Optional<Person>> findAllByNameAndSurname (@RequestParam("name") String name,
                                                    @RequestParam("surname") String surname){
        return service.findAllByNameAndSurname(name, surname);
    }

    @PreAuthorize("#username == authentication.principal.username")
    @GetMapping("/test-username")
    String testUsername(@RequestParam("username") String username){
        return "Hello, your username is " + username;
    }

}
