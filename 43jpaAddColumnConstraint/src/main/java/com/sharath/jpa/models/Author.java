package com.sharath.jpa.models;

import jakarta.persistence.*;
import lombok.Cleanup;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
public class Author {
    @Id
    @GeneratedValue
    private Integer id; // we r not using int because , by default int = 0, Integer = null

    @Column(name = "fname",
        length = 50)
    private String firstname;
    private String lastname;

    @Column(unique = true,
        nullable = false)
    private String email;
    private Integer age;

    @Column(updatable = false, nullable = false)
    private LocalDateTime createdAt;

    @Column(insertable = false)
    private LocalDateTime lastModified;
}
