package com.greymatter.identity.infrastructure.adapters.input.rest.model;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonResponse {
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
