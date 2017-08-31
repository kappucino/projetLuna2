package com.formation.dao;

import java.util.List;


import com.formation.domain.Fournisseur;

public interface FournisseurDAO{
	public void createFournisseur(Fournisseur fournisseur);
	public void deleteFournisseur(long  id);
	public void updateFournisseur(Fournisseur fournisseur);
	public List<Fournisseur> getListFournisseur();
}
