package com.formation.service;

import java.util.List;

import com.formation.domain.Article;
import com.formation.domain.Fournisseur;

public interface FournisseurService {
	public void createFournisseur(Fournisseur fournisseur);
	public void deleteFournisseur(long  id);
	public void updateFournisseur(Fournisseur fournisseur);
	public List<Fournisseur> getListFournisseur();
	public Fournisseur find(long id);
}
