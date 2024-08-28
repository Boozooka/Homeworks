package com.example.hw_8_2_1_1_dao_hibernate.base;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {
    @Id
    private String name;
    @Id
    private String surname;
    @Id
    private int age;
    private String phone_number;
    private String city_of_living;


}
