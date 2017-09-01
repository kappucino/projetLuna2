package com.formation.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.formation.dao.ArticleDAO;
import com.formation.dao.CategorieDAO;
import com.formation.domain.Categorie;
import com.formation.service.CategorieService;

@Repository("CategorieService")
@Transactional
public class CategorieServiceImpl implements CategorieService{
	
	private static CategorieDAO categorieDAO;
	
	@Autowired
	private SessionFactory sessionFactory;
	

	
	public void setSessionFactory(SessionFactory sessionFactory){
		
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void createCategorie(Categorie categorie) {
		// TODO Auto-generated method stub
		categorieDAO.createCategorie(categorie);
	}

	@Override
	public void deleteCategorie(long id) {
		// TODO Auto-generated method stub
		categorieDAO.deleteCategorie(id);
	}

	@Override
	public void updateCategorie(Categorie categorie) {
		// TODO Auto-generated method stub
		categorieDAO.updateCategorie(categorie);
	}

	@Override
	public List<Categorie> getListCategorie() {
		// TODO Auto-generated method stub
		return categorieDAO.getListCategorie();
	}

	@Override
	public Categorie find(long id) {
		// TODO Auto-generated method stub
		return categorieDAO.find(id);
	}

}
