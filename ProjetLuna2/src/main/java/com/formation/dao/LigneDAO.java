package com.formation.dao;

import java.util.List;

import com.formation.domain.Ligne;

public interface LigneDAO {


		public void createLigne(Ligne ligne);
		public void deleteLigne(long  id);
		public void updateLigne(Ligne ligne);
		public List<Ligne> getListLigne();
		public Ligne find(long id);
	
}
