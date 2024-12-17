package com.visual.status.notemanagementsystem.dtos.responses;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegisterUserResponse {
    private String message;
    private String email;
    private String id;
}
