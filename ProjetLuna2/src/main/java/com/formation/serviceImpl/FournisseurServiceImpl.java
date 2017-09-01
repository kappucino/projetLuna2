package com.formation.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.formation.dao.CommandeDAO;
import com.formation.dao.FournisseurDAO;
import com.formation.domain.Fournisseur;
import com.formation.service.FournisseurService;

@Repository("FournisseurService")
@Transactional
public class FournisseurServiceImpl implements FournisseurService{

	private static FournisseurDAO fournisseurDAO;
	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	public void setSessionFactory(SessionFactory sessionFactory){
		
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void createFournisseur(Fournisseur fournisseur) {
		// TODO Auto-generated method stub
		fournisseurDAO.createFournisseur(fournisseur);
	}

	@Override
	public void deleteFournisseur(long id) {
		// TODO Auto-generated method stub
		fournisseurDAO.deleteFournisseur(id);
	}

	@Override
	public void updateFournisseur(Fournisseur fournisseur) {
		// TODO Auto-generated method stub
		fournisseurDAO.updateFournisseur(fournisseur);
	}

	@Override
	public List<Fournisseur> getListFournisseur() {
		// TODO Auto-generated method stub
		return fournisseurDAO.getListFournisseur();
	}

	@Override
	public Fournisseur find(long id) {
		// TODO Auto-generated method stub
		return fournisseurDAO.find(id);
	}

}
