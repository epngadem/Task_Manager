package com.example.taskmanager.repository;

import com.example.taskmanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List; 

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByEmail(String email); //retourne une liste d'utilisateurs
}
