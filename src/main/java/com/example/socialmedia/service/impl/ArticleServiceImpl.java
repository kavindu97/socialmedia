package com.example.socialmedia.service.impl;

import com.example.socialmedia.model.Articles;
import com.example.socialmedia.repositary.ArticlesRepositary;
import com.example.socialmedia.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticlesRepositary articlesRepositary;

    @Override
    public Articles saveArticle(Articles articles) {
       return articlesRepositary.save(articles);
    }
}
