package com.formation.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.formation.dao.FournisseurDAO;
import com.formation.domain.Commande;
import com.formation.domain.Fournisseur;

@Repository("FournisseurDAO")
@Transactional
public class FournisseurDAOImpl implements FournisseurDAO{

private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
		
	}
	
	@Override
	public void createFournisseur(Fournisseur fournisseur) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().save(fournisseur);
	}

	@Override
	public void deleteFournisseur(long id) {
		// TODO Auto-generated method stub
		Fournisseur fournisseur = (Fournisseur) this.sessionFactory.getCurrentSession().load(Fournisseur.class, id);
		if(null != fournisseur){
			this.sessionFactory.getCurrentSession().delete(fournisseur);
		}
	}

	@Override
	public void updateFournisseur(Fournisseur fournisseur) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().update(fournisseur);
	}

	@Override
	public List<Fournisseur> getListFournisseur() {
		// TODO Auto-generated method stub
		return this.sessionFactory.getCurrentSession().createQuery("from fournisseur").list();
	}
	
	public Fournisseur find(long id) {
		// TODO Auto-generated method stub
		Fournisseur fournisseur = (Fournisseur) this.sessionFactory.getCurrentSession().load(Fournisseur.class, id);
		if(null != fournisseur){
			this.sessionFactory.getCurrentSession().find(Fournisseur.class, fournisseur.getCode());
			
		}
		return this.sessionFactory.getCurrentSession().find(Fournisseur.class, fournisseur.getCode());
	}
	
}
