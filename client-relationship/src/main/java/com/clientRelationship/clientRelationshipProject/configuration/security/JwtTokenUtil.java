package com.clientRelationship.clientRelationshipProject.configuration.security;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.clientRelationship.clientRelationshipProject.models.dto.ValidationResponse;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class JwtTokenUtil {

    private final RestTemplate restTemplate;

    public JwtTokenUtil(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public boolean validateToken(String token) {
        try {
            String url = "http://localhost:4000/auth/validate";
            Map<String, Object> map = new HashMap<>();
            HttpHeaders headers = new HttpHeaders();
            // set `content-type` header
            headers.setContentType(MediaType.APPLICATION_JSON);
            // set `accept` header
            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

            map.put("token", token);

    // build the request
            HttpEntity<Map<String, Object>> entity = new HttpEntity<>(map, headers);

            // send POST request
            ResponseEntity<ValidationResponse> response = this.restTemplate.postForEntity(url, entity, ValidationResponse.class);

            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
