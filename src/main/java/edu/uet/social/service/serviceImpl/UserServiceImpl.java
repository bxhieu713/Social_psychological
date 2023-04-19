package edu.uet.social.service.serviceImpl;

import edu.uet.social.entity.User;
import edu.uet.social.repository.UserRepository;
import edu.uet.social.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);

    }
}

