package com.formation.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import com.formation.dao.ArticleDAO;
import com.formation.domain.Adresse;
import com.formation.domain.Article;

@Repository("ArticleDAO")
@Transactional
public class ArticleDAOImpl  implements ArticleDAO{

private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
		
	}
	
	
	@Override
	public void createArticle(Article article) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().save(article);
	}

	@Override
	public void deleteArticle(long id) {
		// TODO Auto-generated method stub
		Article article = (Article) this.sessionFactory.getCurrentSession().load(Article.class, id);
		if(null != article){
			this.sessionFactory.getCurrentSession().delete(article);
		}
	}

	@Override
	public void updateArticle(Article article) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().update(article);
	}

	@Override
	public List<Article> getListArticle() {
		// TODO Auto-generated method stub
		return this.sessionFactory.getCurrentSession().createQuery("from article").list();
	}
	
	
	public Article find(long id) {
		// TODO Auto-generated method stub
		Article article = (Article) this.sessionFactory.getCurrentSession().load(Article.class, id);
		if(null != article){
			this.sessionFactory.getCurrentSession().find(Article.class, article.getCode());
			
		}
		return this.sessionFactory.getCurrentSession().find(Article.class, article.getCode());
	}
	
}
