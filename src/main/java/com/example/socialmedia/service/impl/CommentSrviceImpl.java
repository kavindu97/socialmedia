package com.example.socialmedia.service.impl;

import com.example.socialmedia.model.Comment;
import com.example.socialmedia.repositary.CommentRepositray;
import com.example.socialmedia.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentSrviceImpl implements CommentService {
    @Autowired
    private CommentRepositray commentRepositray;

    @Override
    public Comment saveComments(Comment comment) {
        return commentRepositray.save(comment);
    }
}
