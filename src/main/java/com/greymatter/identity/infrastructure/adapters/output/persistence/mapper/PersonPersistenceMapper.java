package com.greymatter.identity.infrastructure.adapters.output.persistence.mapper;

import com.greymatter.identity.domain.model.Person;
import com.greymatter.identity.infrastructure.adapters.output.persistence.entity.PersonEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonPersistenceMapper {
    PersonEntity toPersonEntity(Person person);
    Person toPerson(PersonEntity personEntity);
}
