package com.formation.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.formation.dao.ClientDAO;
import com.formation.domain.Client;

@Repository("ClientDAO")
@Transactional
public class ClientDAOImpl implements ClientDAO{

	
private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
		
	}
	
	
	
	@Override
	public void createClient(Client client) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().save(client);
	}

	@Override
	public void deleteClient(long id) {
		// TODO Auto-generated method stub
		Client client = (Client) this.sessionFactory.getCurrentSession().load(Client.class, id);
		if(null != client){
			this.sessionFactory.getCurrentSession().delete(client);
		}
	}

	@Override
	public void updateClient(Client client) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().update(client);
	}

	@Override
	public List<Client> getListClient() {
		// TODO Auto-generated method stub
		return this.sessionFactory.getCurrentSession().createQuery("from client").list();
	}
	
	public Client find(long id) {
		// TODO Auto-generated method stub
		Client client = (Client) this.sessionFactory.getCurrentSession().load(Client.class, id);
		if(null != client){
			this.sessionFactory.getCurrentSession().find(Client.class, client.getCode());
			
		}
		return this.sessionFactory.getCurrentSession().find(Client.class, client.getCode());
	}
	
}
