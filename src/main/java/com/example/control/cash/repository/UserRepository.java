package com.example.control.cash.repository;

import com.example.control.cash.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
