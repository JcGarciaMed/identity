package com.greymatter.identity.infrastructure.adapters.input.rest.mapper;

import com.greymatter.identity.domain.model.Person;
import com.greymatter.identity.infrastructure.adapters.input.rest.model.PersonResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PersonRestMapper {
        PersonResponse toPersonResponse(Person person);
}
