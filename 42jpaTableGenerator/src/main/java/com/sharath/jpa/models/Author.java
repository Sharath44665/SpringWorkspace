package com.sharath.jpa.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE,
        generator = "author_id_gen")
    @TableGenerator(name = "author_id_gen",
        table = "id_generator",
        pkColumnName = "id_name",
        valueColumnName = "id_value",
        allocationSize = 1)
    private Integer id; // we r not using int because , by default int = 0, Integer = null

    private String firstname;
    private String lastname;
    private String email;
    private Integer age;
}
