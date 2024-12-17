package com.visual.status.notemanagementsystem.service;

import com.visual.status.notemanagementsystem.dtos.requests.RegisterUserRequest;
import com.visual.status.notemanagementsystem.dtos.responses.RegisterUserResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class UserServiceTest {
    @Autowired
    private UserService userService;
    @Test
    public void testToRegisterUser(){
        RegisterUserRequest request = new RegisterUserRequest();
        request.setEmail("test@test.com");
        request.setPassword("test123");
        request.setFirstName("Torbem");
        request.setLastName("Aorjir");
        RegisterUserResponse response = userService.register(request);
        assertThat(response).isNotNull();
        assertThat(userService.getAllUsers().size()).isEqualTo(1L);
        assertThat(response.getMessage()).contains("Successfully registered");
    }

}