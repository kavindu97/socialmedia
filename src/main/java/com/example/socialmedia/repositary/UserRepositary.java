package com.example.socialmedia.repositary;

import com.example.socialmedia.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositary extends JpaRepository<User,Integer> {
}
