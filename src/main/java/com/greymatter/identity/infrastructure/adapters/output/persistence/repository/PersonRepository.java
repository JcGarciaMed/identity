package com.greymatter.identity.infrastructure.adapters.output.persistence.repository;

import com.greymatter.identity.infrastructure.adapters.output.persistence.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<PersonEntity, Long> {

    Optional<PersonEntity> findByDoi(String doi);

}
