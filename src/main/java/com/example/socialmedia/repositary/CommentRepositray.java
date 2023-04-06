package com.example.socialmedia.repositary;

import com.example.socialmedia.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepositray extends JpaRepository<Comment,Integer> {
}
