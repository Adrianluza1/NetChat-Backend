package org.netchat.repository;

import org.netchat.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserRepository {

    private final Map<String, User> users = new HashMap<>();

    public void addUser(User user) {
        users.put(user.getId(), user);
    }

    public User findById(String userId) {
        return users.get(userId);
    }

    public List<User> getUsers() {
        return List.copyOf(users.values());
    }
}
