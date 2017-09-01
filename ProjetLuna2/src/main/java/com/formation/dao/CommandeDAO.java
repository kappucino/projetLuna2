package com.formation.dao;

import java.util.List;

import com.formation.domain.Adresse;import com.formation.domain.Commande;

public interface CommandeDAO {

	public void createCommande(Commande commande);
	public void deleteCommande(long  id);
	public void updateCommande(Commande commande);
	public List<Commande> getListClient();
	public Commande find(long id);
	
}
