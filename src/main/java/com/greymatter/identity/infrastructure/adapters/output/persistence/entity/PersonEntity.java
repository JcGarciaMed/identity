package com.greymatter.identity.infrastructure.adapters.output.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "persons")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String doi;
    private String lastName;
    private String firstName;
    private String middleName;
    private String gender;
    private LocalDateTime dateOfBirth;
    private LocalDateTime inscriptionDate;
    private LocalDateTime expirationDate;
}
