package com.formation.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.formation.dao.CategorieDAO;
import com.formation.dao.ClientDAO;
import com.formation.domain.Client;
import com.formation.service.ClientService;

@Repository("ClientService")
@Transactional
public class ClientServiceImpl implements ClientService {
	
	@Autowired
	private ClientDAO clientDAO;

	

	

	@Override
	public void createClient(Client client) {
		// TODO Auto-generated method stub
		clientDAO.createClient(client);
	}

	@Override
	public void deleteClient(String id) {
		// TODO Auto-generated method stub
		clientDAO.deleteClient(id);
	}

	@Override
	public void updateClient(Client client) {
		// TODO Auto-generated method stub
		clientDAO.updateClient(client);
	}

	@Override
	public List<Client> getListClient() {
		// TODO Auto-generated method stub
		return clientDAO.getListClient();
	}

	@Override
	public Client find(long id) {
		// TODO Auto-generated method stub
		return clientDAO.find(id);
	}

}
