package com.formation.action;

import java.security.SecureRandom;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.formation.domain.Adresse;
import com.formation.domain.Client;
import com.formation.service.AdresseService;
import com.formation.service.ClientService;
import com.formation.util.RandomString;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UpdateAction extends ActionSupport implements ModelDriven<Adresse>{

	private static final long serialVersionUID = 1L;

	private Client client;
	private Adresse adresse;
	private  ApplicationContext context;
	@Autowired
	private AdresseService adresseService;
	
	@Autowired
	private ClientService clientService;
	
	List<Client> clients = new ArrayList<Client>();
	
	LocalDate inputDate = LocalDate.of(1993,02,18);
	
	@Override
	public String execute()throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		adresseService  = (AdresseService) context.getBean("AdresseServiceImpl");
		clientService = (ClientService) context.getBean("ClientService");
		
		String easy = RandomString.digits + "ACEFGHJKLMNPQRUVWXYabcdefhijkprstuvwx";
		RandomString tickets = new RandomString(23, new SecureRandom(), easy);
		
		
		Adresse adresse = new Adresse(this.adresse.getCodePostal(),this.adresse.getRue(),this.adresse.getVille());
		Client client = new Client(tickets.nextString(),this.client.getNom(),this.client.getPrenom(),this.client.isCarte_fidele(),inputDate,this.adresse);
		
		clientService.createClient(client);
		
		return SUCCESS;
	}

	
	public String listClient() {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		adresseService  = (AdresseService) context.getBean("AdresseServiceImpl");
		clientService = (ClientService) context.getBean("ClientService");
		
		clients = clientService.getListClient();
		return SUCCESS;
	}




	public List<Client> getClients() {
		return clients;
	}


	public void setClients(List<Client> clients) {
		this.clients = clients;
	}


	@Override
	public Adresse getModel() {
		// TODO Auto-generated method stub
		return adresse;
	}







	public Client getClient() {
		return client;
	}







	public void setClient(Client client) {
		this.client = client;
	}







	public Adresse getAdresse() {
		return adresse;
	}







	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}







	public AdresseService getAdresseService() {
		return adresseService;
	}







	public void setAdresseService(AdresseService adresseService) {
		this.adresseService = adresseService;
	}


	
	
}
