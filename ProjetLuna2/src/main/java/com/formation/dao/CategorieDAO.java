package com.formation.dao;

import java.util.List;


import com.formation.domain.Categorie;

public interface CategorieDAO {

	public void createCategorie(Categorie categorie);
	public void deleteCategorie(long  id);
	public void updateCategorie(Categorie categorie);
	public List<Categorie> getListCategorie();
	public Categorie find(long id);
	
}
