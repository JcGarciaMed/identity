package com.greymatter.identity.application.service;

import com.greymatter.identity.application.ports.input.PersonServicePort;
import com.greymatter.identity.application.ports.output.PersonPersistencePort;
import com.greymatter.identity.domain.exception.PersonNotFoundException;
import com.greymatter.identity.domain.model.Person;

public class PersonService implements PersonServicePort {
    private final PersonPersistencePort personPersistencePort;

    public PersonService(PersonPersistencePort personPersistencePort) {
        this.personPersistencePort = personPersistencePort;
    }

    @Override
    public Person findByDoi(String doi) {
        return personPersistencePort.findByDoi(doi).orElseThrow(()->new PersonNotFoundException());
    }
}
