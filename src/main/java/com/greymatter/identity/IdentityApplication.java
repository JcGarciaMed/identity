package com.greymatter.identity;

import com.greymatter.identity.infrastructure.adapters.output.persistence.entity.PersonEntity;
import com.greymatter.identity.infrastructure.adapters.output.persistence.repository.PersonRepository;
import com.greymatter.identity.utils.IdentityContactDto;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EnableConfigurationProperties(value = {IdentityContactDto.class})
@RequiredArgsConstructor
public class IdentityApplication implements CommandLineRunner {

    private final PersonRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(IdentityApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        List<PersonEntity> entities = Arrays.asList(
                new PersonEntity(null, "45555215", "Garcia Medina", "Jorge", "Carlos", "Masculino", LocalDateTime.of(1989, Month.FEBRUARY,7,0,0,0,0), LocalDateTime.now(),LocalDateTime.now()),
                new PersonEntity(null, "45555216", "Garcia Medina", "Jorge", "Carlos", "Masculino", LocalDateTime.of(1989, Month.FEBRUARY,7,0,0,0,0), LocalDateTime.now(),LocalDateTime.now()),
                new PersonEntity(null, "45555217", "Garcia Medina", "Jorge", "Carlos", "Masculino", LocalDateTime.of(1989, Month.FEBRUARY,7,0,0,0,0), LocalDateTime.now(),LocalDateTime.now()));
        repository.saveAll(entities);
    }
}
