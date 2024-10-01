package com.sharath.jpa.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Author {
    @Id
    @GeneratedValue
    private Integer id; // we r not using int because , by default int = 0, Integer = null
    private String firstname;
    private String lastname;
    private String email;
    private Integer age;
}
