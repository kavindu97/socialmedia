package com.example.socialmedia.controller;

import com.example.socialmedia.model.Articles;
import com.example.socialmedia.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @PostMapping("/save")
    public String saveArticle(@RequestBody Articles articles) {
        articleService.saveArticle(articles);
        return "saved Article";
    }
}
