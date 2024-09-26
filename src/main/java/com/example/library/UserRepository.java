package com.example.library;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {  // Используйте UserEntity
    Optional<UserEntity> findByUsername(String username);  // Метод возвращает Optional<UserEntity>
}
