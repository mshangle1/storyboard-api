package com.mshangle.storyboard.repository;

import com.mshangle.storyboard.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    
}
