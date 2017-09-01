package com.formation.service;

import java.util.List;


import com.formation.domain.Article;

public interface ArticleService {
	public void createArticle(Article article);
	public void deleteArticle(long  id);
	public void updateArticle(Article article);
	public List<Article> getListArticle();
	public Article find(long id);
}
