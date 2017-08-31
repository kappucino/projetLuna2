package com.formation.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.formation.dao.ModeReglementDAO;
import com.formation.domain.Ligne;
import com.formation.domain.ModeReglements;

@Repository("ModeReglementDAO")
@Transactional
public class ModeReglementDAOImpl implements ModeReglementDAO {

private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
		
	}
	
	
	@Override
	public void createModeReglement(ModeReglements modeReglement) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().save(modeReglement);
	}

	@Override
	public void deleteModeReglement(long id) {
		// TODO Auto-generated method stub
		ModeReglements modeReglement = (ModeReglements) this.sessionFactory.getCurrentSession().load(ModeReglements.class, id);
		if(null != modeReglement){
			this.sessionFactory.getCurrentSession().delete(modeReglement);
		}
	}

	@Override
	public void updateModeReglement(ModeReglements modeReglement) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().update(modeReglement);
	}

	@Override
	public List<ModeReglements> getListModeReglement() {
		// TODO Auto-generated method stub
		return this.sessionFactory.getCurrentSession().createQuery("from modeReglement").list();
	}
	
	public ModeReglements find(long id) {
		// TODO Auto-generated method stub
		ModeReglements modeReglement = (ModeReglements) this.sessionFactory.getCurrentSession().load(ModeReglements.class, id);
		if(null != modeReglement){
			this.sessionFactory.getCurrentSession().find(ModeReglements.class, modeReglement.getCode());
			
		}
		return this.sessionFactory.getCurrentSession().find(ModeReglements.class, modeReglement.getCode());
	}
}
