package com.greymatter.identity.infrastructure.adapters.input.rest;

import com.greymatter.identity.application.ports.input.PersonServicePort;
import com.greymatter.identity.infrastructure.adapters.input.rest.mapper.PersonRestMapper;
import com.greymatter.identity.infrastructure.adapters.input.rest.model.PersonResponse;
import jakarta.validation.constraints.Pattern;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reniec")
@RequiredArgsConstructor
public class PersonController {

    private final PersonServicePort personServicePort;
    private final PersonRestMapper mapper;

    @GetMapping("/v1/api/{doi}")
    public PersonResponse findById(@PathVariable @Pattern(regexp="(^$|[0-9]{8})",message = "Mobile number must be 8 digits") String doi) {
        return mapper.toPersonResponse(personServicePort.findByDoi(doi));
    }
}
