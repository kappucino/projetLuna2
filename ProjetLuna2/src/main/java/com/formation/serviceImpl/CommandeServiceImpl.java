package com.formation.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.formation.dao.ClientDAO;
import com.formation.dao.CommandeDAO;
import com.formation.domain.Commande;
import com.formation.service.CommandeService;

@Repository("CommandeService")
@Transactional
public class CommandeServiceImpl implements CommandeService{
	
	
	private static CommandeDAO commandeDAO;
	@Autowired
	private SessionFactory sessionFactory;
	

	
	public void setSessionFactory(SessionFactory sessionFactory){
		
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void createCommande(Commande commande) {
		// TODO Auto-generated method stub
		commandeDAO.createCommande(commande);
	}

	@Override
	public void deleteCommande(long id) {
		// TODO Auto-generated method stub
		commandeDAO.deleteCommande(id);
	}

	@Override
	public void updateCommande(Commande commande) {
		// TODO Auto-generated method stub
		commandeDAO.updateCommande(commande);
	}

	@Override
	public List<Commande> getListClient() {
		// TODO Auto-generated method stub
		return commandeDAO.getListClient();
	}

	@Override
	public Commande find(long id) {
		// TODO Auto-generated method stub
		return commandeDAO.find(id);
	}

}
