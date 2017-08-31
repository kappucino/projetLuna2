package com.formation.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.formation.dao.LigneDAO;

import com.formation.domain.Ligne;



@Repository("LigneDAO")
@Transactional
public class LigneDAOImpl implements LigneDAO{

	
private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
		
	}
	
	@Override
	public void createLigne(Ligne ligne) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().save(ligne);
	}

	@Override
	public void deleteLigne(long id) {
		// TODO Auto-generated method stub
		Ligne ligne = (Ligne) this.sessionFactory.getCurrentSession().load(Ligne.class, id);
		if(null != ligne){
			this.sessionFactory.getCurrentSession().delete(ligne);
		}
	}

	@Override
	public void updateLigne(Ligne ligne) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().update(ligne);
	}

	@Override
	public List<Ligne> getListLigne() {
		// TODO Auto-generated method stub
		return this.sessionFactory.getCurrentSession().createQuery("from ligne").list();
	}
	
	public Ligne find(long id) {
		// TODO Auto-generated method stub
		Ligne ligne = (Ligne) this.sessionFactory.getCurrentSession().load(Ligne.class, id);
		if(null != ligne){
			this.sessionFactory.getCurrentSession().find(Ligne.class, ligne.getId());
			
		}
		return this.sessionFactory.getCurrentSession().find(Ligne.class, ligne.getId());
	}
}
