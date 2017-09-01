package com.formation.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.formation.dao.AdressseDAO;
import com.formation.domain.Adresse;
import com.formation.service.AdresseService;

@Service("AdresseServiceImpl")
@Transactional
public class AdresseServiceImpl implements AdresseService{
	
	@Autowired
	private AdressseDAO adresseDAO;
	


	@Override
	public void createAdresse(Adresse adresse) {
		// TODO Auto-generated method stub
		adresseDAO.createAdresse(adresse);
	}

	@Override
	public void deleteAdresse(long id) {
		// TODO Auto-generated method stub
		adresseDAO.deleteAdresse(id);
	}

	@Override
	public void updateAdresse(Adresse adresse) {
		// TODO Auto-generated method stub
		adresseDAO.updateAdresse(adresse);
	}

	@Override
	public List<Adresse> getListAdresse() {
		// TODO Auto-generated method stub
		return adresseDAO.getListAdresse();
	}

	@Override
	public Adresse find(long id) {
		// TODO Auto-generated method stub
		
		return adresseDAO.find(id);
	}

}
