package com.teamtaskpro.application.service;

import com.teamtaskpro.domain.entity.User;
import java.util.List;
import java.util.Optional;

public interface UserService {
    User createUser(User user);

    Optional<User> getUserById(Long id);

    List<User> getAllUsers();

    User updateUser(User user);

    void deleteUser(Long id);

    Optional<User> getUserByUsername(String username);
}