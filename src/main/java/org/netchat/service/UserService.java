package org.netchat.service;

import org.netchat.model.User;
import org.netchat.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Método para registrar un nuevo usuario
    public User registerUser(String username) {
        String userId = UUID.randomUUID().toString(); // Genera un ID único
        User user = new User(userId, username);
        userRepository.addUser(user);
        return user;
    }

    // Método para marcar a un usuario como en línea
    public void setUserOnline(String userId) {
        User user = userRepository.findById(userId);
        if (user != null) {
            user.setOnline(true);
        }
    }

    // Método para marcar a un usuario como fuera de línea
    public void setUserOffline(String userId) {
        User user = userRepository.findById(userId);
        if (user != null) {
            user.setOnline(false);
        }
    }

    // Método para obtener todos los usuarios en línea
    public List<String> getOnlineUsers() {
        return userRepository.getUsers().stream()
                .filter(User::isOnline)
                .map(User::getUsername)
                .collect(Collectors.toList());
    }
}
