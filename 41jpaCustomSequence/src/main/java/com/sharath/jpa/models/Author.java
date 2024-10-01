package com.sharath.jpa.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "author_sequence")
    @SequenceGenerator(name = "author_sequence",
            sequenceName = "author_sequence",
            allocationSize = 1) // create sequence of author_sequence
    private Integer id; // we r not using int because , by default int = 0, Integer = null

    private String firstname;
    private String lastname;
    private String email;
    private Integer age;
}
