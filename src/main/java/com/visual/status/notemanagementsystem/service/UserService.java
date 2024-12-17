package com.visual.status.notemanagementsystem.service;

import com.visual.status.notemanagementsystem.data.model.User;
import com.visual.status.notemanagementsystem.dtos.requests.RegisterUserRequest;
import com.visual.status.notemanagementsystem.dtos.responses.RegisterUserResponse;

import java.util.List;

public interface UserService {

    RegisterUserResponse register(RegisterUserRequest request);

    List<User> getAllUsers();

}
