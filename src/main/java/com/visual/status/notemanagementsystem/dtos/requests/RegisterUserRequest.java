package com.visual.status.notemanagementsystem.dtos.requests;

import lombok.Data;

@Data
public class RegisterUserRequest {
    private String firstName;
    private String email;
    private String password;
    private String lastName;
}
