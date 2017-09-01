package com.formation.service;

import java.util.List;

import com.formation.domain.Article;
import com.formation.domain.Categorie;

public interface CategorieService {
	public void createCategorie(Categorie categorie);
	public void deleteCategorie(long  id);
	public void updateCategorie(Categorie categorie);
	public List<Categorie> getListCategorie();
	public Categorie find(long id);
}
