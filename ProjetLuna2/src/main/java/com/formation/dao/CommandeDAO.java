package com.formation.dao;

import java.util.List;

import com.formation.domain.Commande;

public interface CommandeDAO {

	public void createCommande(Commande commande);
	public void deleteCommande(long  id);
	public void updateCommande(Commande commande);
	public List<Commande> getListClient();
	
	
}
