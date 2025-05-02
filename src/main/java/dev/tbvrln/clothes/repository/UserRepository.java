package dev.tbvrln.clothes.repository;

import dev.tbvrln.clothes.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);
}