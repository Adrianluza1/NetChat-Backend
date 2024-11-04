package org.netchat.service;

import org.netchat.model.User;
import org.netchat.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * UserService provides business logic for user-related operations,
 * such as retrieving user information and creating new users.
 */
@Service
public class    UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(Long id, User userDetails) {
        Optional<User> existingUser = userRepository.findById(id);
        if (existingUser.isPresent()) {
            User userToUpdate = existingUser.get();
            userToUpdate.setUsername(userDetails.getUsername());
            userToUpdate.setEmail(userDetails.getEmail());
            // Actualizar otros campos según sea necesario
            return userRepository.save(userToUpdate);
        }
        return null;
    }
}
