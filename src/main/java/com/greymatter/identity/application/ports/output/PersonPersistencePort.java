package com.greymatter.identity.application.ports.output;

import com.greymatter.identity.domain.model.Person;

import java.util.Optional;

public interface PersonPersistencePort {
    Optional<Person> findByDoi(String doi);
}
