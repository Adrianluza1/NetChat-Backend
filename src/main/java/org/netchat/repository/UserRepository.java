package org.netchat.repository;

import org.netchat.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class UserRepository {

    private final Map<String, User> users = new HashMap<>();

    public void addUser(User user) {
        users.put(user.getId(), user);
    }

    public void removeUser(String userId) {
        users.remove(userId);
    }

    public List<String> getOnlineUsers() {
        return users.values().stream()
                .filter(User::isOnline)
                .map(User::getUsername)
                .collect(Collectors.toList());
    }

    public User findById(String userId) {
        return users.get(userId);
    }
}
