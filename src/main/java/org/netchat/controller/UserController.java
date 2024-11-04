package org.netchat.controller;

import org.springframework.web.bind.annotation.*;

/**
 * UserController manages user-related endpoints, such as retrieving and updating user profiles.
 */
@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("/{id}")
    public String getUser(@PathVariable Long id) {
        // Implementación para obtener información de un usuario
        return "User information";
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable Long id, @RequestBody String userDetails) {
        // Implementación para actualizar la información de un usuario
        return "User information updated successfully";
    }
}
