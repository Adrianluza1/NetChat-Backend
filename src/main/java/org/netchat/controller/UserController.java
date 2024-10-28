package org.netchat.controller;

import org.netchat.model.User;
import org.netchat.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Endpoint para registrar un nuevo usuario
    @PostMapping("/register")
    public User registerUser(@RequestParam String username) {
        return userService.registerUser(username);
    }

    // Endpoint para marcar un usuario como en línea
    @PostMapping("/{userId}/online")
    public void setUserOnline(@PathVariable String userId) {
        userService.setUserOnline(userId);
    }

    // Endpoint para marcar un usuario como fuera de línea
    @PostMapping("/{userId}/offline")
    public void setUserOffline(@PathVariable String userId) {
        userService.setUserOffline(userId);
    }

    // Endpoint para obtener usuarios en línea
    @GetMapping("/online")
    public List<String> getOnlineUsers() {
        return userService.getOnlineUsers();
    }
}
