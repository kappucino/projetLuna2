package com.formation.service;

import java.util.List;

import com.formation.domain.Article;
import com.formation.domain.Commande;

public interface CommandeService {
	public void createCommande(Commande commande);
	public void deleteCommande(long  id);
	public void updateCommande(Commande commande);
	public List<Commande> getListClient();
	public Commande find(long id);
}
