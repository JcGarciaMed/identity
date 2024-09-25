package com.greymatter.identity.infrastructure.config;

import com.greymatter.identity.application.ports.output.PersonPersistencePort;
import com.greymatter.identity.application.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class ReniecConfig {
    private final PersonPersistencePort persistencePort;

    @Bean
    public PersonService reniecService() {
        return new PersonService(persistencePort);
    }

}
