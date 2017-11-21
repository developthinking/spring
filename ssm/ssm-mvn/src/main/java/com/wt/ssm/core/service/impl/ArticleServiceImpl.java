package com.wt.ssm.core.service.impl;


import com.wt.ssm.core.dao.ArticleDao;
import com.wt.ssm.core.entity.Article;
import com.wt.ssm.core.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("articleService")
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    public List<Article> findArticle(Map<String, Object> map) {
        return articleDao.findArticles(map);
    }

    public Long getTotalArticle(Map<String, Object> map) {
        return articleDao.getTotalArticles(map);
    }

    public int addArticle(Article article) {
        if (article.getArticleTitle() == null || article.getArticleContent() == null || getTotalArticle(null) > 90 || article.getArticleContent().length() > 50000) {
            return 0;
        }
        return articleDao.insertArticle(article);
    }

    public int updateArticle(Article article) {
        if (article.getArticleTitle() == null || article.getArticleContent() == null || getTotalArticle(null) > 90 || article.getArticleContent().length() > 50000) {
            return 0;
        }
        return articleDao.updArticle(article);
    }

    public int deleteArticle(String id) {
        return articleDao.delArticle(id);
    }

    public Article findById(String id) {
        return articleDao.getArticleById(id);
    }

}
