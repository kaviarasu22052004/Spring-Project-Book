package com.hexaware.Book.Entity;

public class User {
    private String username;
    private String password;

    // Getters and setters are mandatory for JSON to Object conversion
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public User() {}

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

