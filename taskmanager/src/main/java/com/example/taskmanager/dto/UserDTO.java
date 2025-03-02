package com.example.taskmanager.dto;

import com.example.taskmanager.model.Task;
import java.util.List;

public class UserDTO {
    private Long id;
    private String username;
    private String email;
    private List<Task> tasks;  // On ne renvoie pas le mot de passe pour des raisons de sécurité

    public UserDTO(Long id, String username, String email, List<Task> tasks) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.tasks = tasks;
    }

    // Getters
    public Long getId() { return id; }
    public String getUsername() { return username; }
    public String getEmail() { return email; }
    public List<Task> getTasks() { return tasks; }
}
