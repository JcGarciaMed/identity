package com.greymatter.identity.infrastructure.adapters.input.rest;

import com.greymatter.identity.application.ports.input.PersonServicePort;
import com.greymatter.identity.infrastructure.adapters.input.rest.mapper.PersonRestMapper;
import com.greymatter.identity.infrastructure.adapters.input.rest.model.PersonResponse;
import com.greymatter.identity.utils.IdentityContactDto;
import jakarta.validation.constraints.Pattern;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reniec")
//@RequiredArgsConstructor
public class PersonController {

    private final PersonServicePort personServicePort;
    private final PersonRestMapper mapper;
    private final IdentityContactDto identityContactDto;

    public PersonController(PersonServicePort personServicePort, PersonRestMapper mapper, IdentityContactDto identityContactDto) {
        this.personServicePort = personServicePort;
        this.mapper = mapper;
        this.identityContactDto = identityContactDto;
    }

    @Value("${build.version}")
    private String buildVersion;


    @GetMapping("/v1/api/{doi}")
    public ResponseEntity<PersonResponse> findById(@PathVariable @Pattern(regexp="(^$|[0-9]{8})",message = "Mobile number must be 8 digits") String doi) {
        return ResponseEntity.status(HttpStatus.OK).body(mapper.toPersonResponse(personServicePort.findByDoi(doi)));
    }

    @GetMapping("/contact-info")
    public ResponseEntity<IdentityContactDto> getContactInfo() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(identityContactDto);
    }
}
