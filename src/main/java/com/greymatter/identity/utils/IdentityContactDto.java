package com.greymatter.identity.utils;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "identity")
@Getter
@Setter
public class IdentityContactDto {

    private String message;
    private Map<String, String> contactDetails;
    private List<String> onCallSupport;

}
