package com.greymatter.identity.application.ports.input;

import com.greymatter.identity.domain.model.Person;

public interface PersonServicePort {
    Person findByDoi(String doi);
}
