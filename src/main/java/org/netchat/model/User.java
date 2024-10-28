package org.netchat.model;

public class User {
    private String id;
    private String username;
    private boolean online;

    // Constructor
    public User(String id, String username) {
        this.id = id;
        this.username = username;
        this.online = false; // Por defecto, el usuario no está en línea
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }
}
