package com.formation.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.formation.dao.CategorieDAO;

import com.formation.domain.Categorie;

@Repository("CategorieDAO")
@Transactional
public class CategorieDAOImpl implements CategorieDAO{

	
private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
		
	}
	
	@Override
	public void createCategorie(Categorie categorie) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().save(categorie);
	}

	@Override
	public void deleteCategorie(long id) {
		// TODO Auto-generated method stub
		Categorie categorie = (Categorie) this.sessionFactory.getCurrentSession().load(Categorie.class, id);
		if(null != categorie){
			this.sessionFactory.getCurrentSession().delete(categorie);
		}
	}

	@Override
	public void updateCategorie(Categorie categorie) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().update(categorie);
	}

	@Override
	public List<Categorie> getListCategorie() {
		// TODO Auto-generated method stub
		return this.sessionFactory.getCurrentSession().createQuery("from categorie").list();
	}
	
	public Categorie find(long id) {
		// TODO Auto-generated method stub
		Categorie categorie = (Categorie) this.sessionFactory.getCurrentSession().load(Categorie.class, id);
		if(null != categorie){
			this.sessionFactory.getCurrentSession().find(Categorie.class, categorie.getCode());
			
		}
		return this.sessionFactory.getCurrentSession().find(Categorie.class, categorie.getCode());
	}
	
}
