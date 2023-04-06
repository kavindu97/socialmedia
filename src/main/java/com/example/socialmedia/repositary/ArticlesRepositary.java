package com.example.socialmedia.repositary;

import com.example.socialmedia.model.Articles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticlesRepositary extends JpaRepository<Articles,Integer> {
}
