package com.visual.status.notemanagementsystem.data.repositories;

import com.visual.status.notemanagementsystem.data.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    boolean existsByEmail(String email);
}
