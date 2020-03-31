package com.example.demo.connectDB;

import com.example.demo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SubjectRepository extends JpaRepository<Users, Integer> {
    Optional<Users> findByUsername(String username);
}
