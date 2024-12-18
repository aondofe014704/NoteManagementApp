package com.visual.status.notemanagementsystem.service;

import com.visual.status.notemanagementsystem.data.model.User;
import com.visual.status.notemanagementsystem.data.repositories.UserRepository;
import com.visual.status.notemanagementsystem.dtos.requests.RegisterUserRequest;
import com.visual.status.notemanagementsystem.dtos.responses.RegisterUserResponse;
import com.visual.status.notemanagementsystem.exceptions.EmailAlreadyExistException;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{
    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;
    private ModelMapper modelMapper;

    @Override
    public RegisterUserResponse register(RegisterUserRequest request) {
        validateExistingEmail(request.getEmail());
        passwordEncoder.encode(request.getPassword());
        User user = modelMapper.map(request, User.class);
        userRepository.save(user);
        RegisterUserResponse response = modelMapper.map(user, RegisterUserResponse.class);
        response.setMessage("Successfully registered");
        response.setId(response.getId());
        response.setEmail(response.getEmail());
        return response;
    }
    private void validateExistingEmail(String email) {
        boolean existsByEmail = userRepository.existsByEmail(email);
        if (existsByEmail) {
            throw new EmailAlreadyExistException("Email already exists.");
        }
    }
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
