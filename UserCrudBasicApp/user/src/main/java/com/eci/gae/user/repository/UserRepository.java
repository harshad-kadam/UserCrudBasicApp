package com.eci.gae.user.repository;

import com.eci.gae.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Additional query methods can be added here if needed
}
