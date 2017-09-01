package com.formation.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.formation.dao.FournisseurDAO;
import com.formation.dao.LigneDAO;
import com.formation.domain.Ligne;
import com.formation.service.LigneService;

@Repository("LigneService")
@Transactional
public class LigneServiceImpl  implements LigneService{

	
	private static LigneDAO ligneDAO;
	@Autowired
	private SessionFactory sessionFactory;
	

	
	public void setSessionFactory(SessionFactory sessionFactory){
		
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void createLigne(Ligne ligne) {
		// TODO Auto-generated method stub
		ligneDAO.createLigne(ligne);
	}

	@Override
	public void deleteLigne(long id) {
		// TODO Auto-generated method stub
		ligneDAO.deleteLigne(id);
	}

	@Override
	public void updateLigne(Ligne ligne) {
		// TODO Auto-generated method stub
		ligneDAO.updateLigne(ligne);
	}

	@Override
	public List<Ligne> getListLigne() {
		// TODO Auto-generated method stub
		return ligneDAO.getListLigne();
	}

	@Override
	public Ligne find(long id) {
		// TODO Auto-generated method stub
		return ligneDAO.find(id);
	}

	
	
}
