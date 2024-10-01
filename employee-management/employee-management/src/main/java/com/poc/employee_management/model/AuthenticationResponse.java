package com.poc.employee_management.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@AllArgsConstructor
public class AuthenticationResponse {

    final private String jwt;
}
