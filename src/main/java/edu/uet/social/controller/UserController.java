package edu.uet.social.controller;

import edu.uet.social.entity.User;
import edu.uet.social.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<?> getUserById(@PathVariable Long userId) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/users") // http://localhost:8081/api/v1/users
    public List getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/users")
    public ResponseEntity<?> createUser(@RequestBody User user) {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

