package org.netchat.service;

import org.netchat.model.User;
import org.netchat.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<String> getOnlineUsers() {
        return userRepository.getOnlineUsers();
    }

    public void setUserOnline(String userId) {
        User user = userRepository.findById(userId);
        if (user != null) {
            user.setOnline(true);
        }
    }

    public void setUserOffline(String userId) {
        User user = userRepository.findById(userId);
        if (user != null) {
            user.setOnline(false);
        }
    }
}
