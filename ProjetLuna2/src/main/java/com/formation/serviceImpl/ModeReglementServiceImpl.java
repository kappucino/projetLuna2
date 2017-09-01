package com.formation.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.formation.dao.LigneDAO;
import com.formation.dao.ModeReglementDAO;
import com.formation.domain.ModeReglements;
import com.formation.service.ModeReglementService;


@Repository("ModeReglementService")
@Transactional
public class ModeReglementServiceImpl implements ModeReglementService{
	
	private static ModeReglementDAO modeReglementDAO;
	@Autowired
	private SessionFactory sessionFactory;
	

	
	public void setSessionFactory(SessionFactory sessionFactory){
		
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void createModeReglement(ModeReglements modeReglement) {
		// TODO Auto-generated method stub
		modeReglementDAO.createModeReglement(modeReglement);
	}

	@Override
	public void deleteModeReglement(long id) {
		// TODO Auto-generated method stub
		modeReglementDAO.deleteModeReglement(id);
	}

	@Override
	public void updateModeReglement(ModeReglements modeReglement) {
		// TODO Auto-generated method stub
		modeReglementDAO.updateModeReglement(modeReglement);
	}

	@Override
	public List<ModeReglements> getListModeReglement() {
		// TODO Auto-generated method stub
		return modeReglementDAO.getListModeReglement();
	}

	@Override
	public ModeReglements find(long id) {
		// TODO Auto-generated method stub
		return modeReglementDAO.find(id);
	}

}
