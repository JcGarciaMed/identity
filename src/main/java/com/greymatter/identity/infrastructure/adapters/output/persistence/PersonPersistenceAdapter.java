package com.greymatter.identity.infrastructure.adapters.output.persistence;

import com.greymatter.identity.application.ports.output.PersonPersistencePort;
import com.greymatter.identity.domain.model.Person;
import com.greymatter.identity.infrastructure.adapters.output.persistence.mapper.PersonPersistenceMapper;
import com.greymatter.identity.infrastructure.adapters.output.persistence.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonPersistenceAdapter implements PersonPersistencePort {

    private final PersonRepository personRepository;
    private final PersonPersistenceMapper mapper;

    @Override
    public Optional<Person> findByDoi(String doi) {
        return personRepository.findByDoi(doi).map(mapper::toPerson);
    }
}
