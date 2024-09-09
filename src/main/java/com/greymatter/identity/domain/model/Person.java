package com.greymatter.identity.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
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
