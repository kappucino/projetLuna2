package com.formation.service;

import java.util.List;

import com.formation.domain.Article;
import com.formation.domain.Client;

public interface ClientService {
	public void createClient(Client client);
	public void deleteClient(String  string);
	public void updateClient(Client client);
	public List<Client> getListClient();
	public Client find(long id);
}
