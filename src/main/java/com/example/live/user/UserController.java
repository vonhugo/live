package com.example.live.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@RestController
@RequestMapping("/api/users")
public class UserController {

  private static final Logger logger = LoggerFactory.getLogger(UserController.class);

  @Autowired
  private UserRepository userRepository;

  @GetMapping
  public List<User> getAllUsers() {
    return userRepository.findAll();
  } 

  @GetMapping("/{id}")
  public User getUserById(@PathVariable Long id) {
    return userRepository.findById(id).get();
  }

  @PostMapping
  public User createUser(@RequestBody User user) {
    return userRepository.save(user);
  }
  
  @PutMapping("/{id}")
  public User updateUser(@PathVariable Long id, @RequestBody User user) {
    User existingUser = userRepository.findById(id).get();

    logger.info("Updating user with ID: {}", id);
    logger.info("New name: {}", user.getName());
    logger.info("New email: {}", user.getEmail());
    logger.info("New username: {}", user.getUsername());
    logger.info("New role: {}", user.getRole());

    existingUser.setName(user.getName());
    existingUser.setEmail(user.getEmail());
    existingUser.setUsername(user.getUsername());
    existingUser.setRole(user.getRole());
    return userRepository.save(existingUser);
  }

  @DeleteMapping("/{id}")
  public String deleteUser(@PathVariable Long id) {
    try {
      userRepository.findById(id).get();
      userRepository.deleteById(id);
      return "User deleted successfully";
    } catch (Exception e) {
      return "User not found";
    }
  }
  
}
