package com.formation.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.formation.dao.AdressseDAO;
import com.formation.domain.Adresse;

@Repository("AdresseDAO")
@Transactional
public class AdresseDAOImpl implements AdressseDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	

	
	public void setSessionFactory(SessionFactory sessionFactory){
		
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void createAdresse(Adresse adresse) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().save(adresse);
	}

	@Override
	public void deleteAdresse(long id) {
		// TODO Auto-generated method stub
		Adresse adresse = (Adresse) this.sessionFactory.getCurrentSession().load(Adresse.class, id);
		if(null != adresse){
			this.sessionFactory.getCurrentSession().delete(adresse);
		}
	}

	@Override
	public void updateAdresse(Adresse adresse) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().update(adresse);
	}

	@Override
	public List<Adresse> getListAdresse() {
		// TODO Auto-generated method stub
		return this.sessionFactory.getCurrentSession().createQuery("from Adresse").list();
	}
	
	public Adresse find(long id) {
		// TODO Auto-generated method stub
		Adresse adresse = (Adresse) this.sessionFactory.getCurrentSession().load(Adresse.class, id);
		if(null != adresse){
			this.sessionFactory.getCurrentSession().find(Adresse.class, adresse.getId());
			
		}
		return this.sessionFactory.getCurrentSession().find(Adresse.class, adresse.getId());
	}
	
	
}
