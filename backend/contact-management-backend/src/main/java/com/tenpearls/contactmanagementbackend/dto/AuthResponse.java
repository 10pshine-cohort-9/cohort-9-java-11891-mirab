package com.tenpearls.contactmanagementbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {
    @ToString.Exclude
    private String token;
    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
}
