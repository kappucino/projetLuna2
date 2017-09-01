package com.formation.service;

import java.util.List;

import com.formation.domain.Article;
import com.formation.domain.Ligne;

public interface LigneService {
	public void createLigne(Ligne ligne);
	public void deleteLigne(long  id);
	public void updateLigne(Ligne ligne);
	public List<Ligne> getListLigne();
	public Ligne find(long id);
}
