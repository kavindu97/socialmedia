package com.example.socialmedia.controller;

import com.example.socialmedia.model.Comment;
import com.example.socialmedia.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/comments")
public class CommentsController {
    @Autowired
    private CommentService commentService;

@PostMapping("/insert")
    public String saveComments(@RequestBody Comment comment){
        commentService.saveComments(comment);
        return "saved comments";
    }
}
