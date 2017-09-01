package com.formation.service;

import java.util.List;

import com.formation.domain.Adresse;

public interface AdresseService {
	public void createAdresse(Adresse adresse);
	public void deleteAdresse(long  id);
	public void updateAdresse(Adresse adresse);
	public List<Adresse> getListAdresse();
	public Adresse find(long id);
}
