package com.formation.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.formation.dao.ArticleDAO;
import com.formation.domain.Adresse;
import com.formation.domain.Article;
import com.formation.service.ArticleService;

@Repository("ArticleService")
@Transactional
public class ArticleServiceImpl implements ArticleService {

	private static ArticleDAO articleDAO;
	
	@Autowired
	private SessionFactory sessionFactory;
	

	
	public void setSessionFactory(SessionFactory sessionFactory){
		
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void createArticle(Article article) {
		// TODO Auto-generated method stub
		articleDAO.createArticle(article);
	}

	@Override
	public void deleteArticle(long id) {
		// TODO Auto-generated method stub
		articleDAO.deleteArticle(id);
	}

	@Override
	public void updateArticle(Article article) {
		// TODO Auto-generated method stub
		articleDAO.updateArticle(article);
	}

	@Override
	public List<Article> getListArticle() {
		// TODO Auto-generated method stub
		return articleDAO.getListArticle();
	}

	@Override
	public Article find(long id) {
		// TODO Auto-generated method stub
		return articleDAO.find(id);
	}
	


	
}
