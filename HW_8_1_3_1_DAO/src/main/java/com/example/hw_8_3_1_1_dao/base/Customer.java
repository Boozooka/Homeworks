package com.example.hw_8_3_1_1_dao.base;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Builder
public class Customer {
    @Id
    @Generated
    private int id;
    private String name;
    private String surname;
    private int age;
    private String phone_number;

    public Customer(int id, String name, String surname, int age, String phone_number){
        this.id = id;
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.phone_number = phone_number;
    }
}
