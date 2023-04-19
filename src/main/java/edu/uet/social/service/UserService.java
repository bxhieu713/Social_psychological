package edu.uet.social.service;

import edu.uet.social.entity.User;

import java.util.Optional;

public interface UserService {
    Optional<User> getUserById(Long id);
    User createUser(User user);
}
