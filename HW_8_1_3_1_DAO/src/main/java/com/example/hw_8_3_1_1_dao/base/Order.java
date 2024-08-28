package com.example.hw_8_3_1_1_dao.base;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {
    //id, date, customer_id,product_name, amount;
    @Id
    @Generated
    private long id;
    private Date date;
    @ManyToOne (optional = false)
    private Customer customer_id;
    private String product_name;
    private int amount;
}
