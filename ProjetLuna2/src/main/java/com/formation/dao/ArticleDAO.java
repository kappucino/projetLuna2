package com.formation.dao;

import java.util.List;


import com.formation.domain.Article;

public interface ArticleDAO {

	public void createArticle(Article article);
	public void deleteArticle(long  id);
	public void updateArticle(Article article);
	public List<Article> getListArticle();
	
	
}
