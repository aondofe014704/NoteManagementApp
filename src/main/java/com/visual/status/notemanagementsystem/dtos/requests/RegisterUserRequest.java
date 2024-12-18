package com.visual.status.notemanagementsystem.dtos.requests;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegisterUserRequest {
    private String firstName;
    private String email;
    private String password;
    private String lastName;

}
