package com.formation.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.formation.dao.CommandeDAO;

import com.formation.domain.Commande;



@Repository("CommandeDAO")
@Transactional
public class CommandeDAOImpl implements CommandeDAO{

	
private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
		
	}
	
	@Override
	public void createCommande(Commande commande) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().save(commande);
	}

	@Override
	public void deleteCommande(long id) {
		// TODO Auto-generated method stub
		Commande commande = (Commande) this.sessionFactory.getCurrentSession().load(Commande.class, id);
		if(null != commande){
			this.sessionFactory.getCurrentSession().delete(commande);
		}
	}

	@Override
	public void updateCommande(Commande commande) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().update(commande);
	}

	@Override
	public List<Commande> getListClient() {
		// TODO Auto-generated method stub
		return this.sessionFactory.getCurrentSession().createQuery("from commande").list();
	}
	
	public Commande find(long id) {
		// TODO Auto-generated method stub
		Commande commande = (Commande) this.sessionFactory.getCurrentSession().load(Commande.class, id);
		if(null != commande){
			this.sessionFactory.getCurrentSession().find(Commande.class, commande.getCode());
			
		}
		return this.sessionFactory.getCurrentSession().find(Commande.class, commande.getCode());
	}
}
