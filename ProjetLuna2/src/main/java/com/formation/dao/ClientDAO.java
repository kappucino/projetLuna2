package com.formation.dao;

import java.util.List;


import com.formation.domain.Client;

public interface ClientDAO {

	public void createClient(Client client);
	public void deleteClient(String  id);
	public void updateClient(Client client);
	public List<Client> getListClient();
	public Client find(long id);
}
