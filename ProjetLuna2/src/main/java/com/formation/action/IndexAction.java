package com.formation.action;

import java.security.SecureRandom;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
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


@Action("/login")
@ResultPath("/admin")
@Result(name = "login", location = "client.jsp")
public class IndexAction extends ActionSupport implements ModelDriven<Client>{

	private static final long serialVersionUID = 1L;
	List<Client> clients = new ArrayList<Client>();
	List<Adresse> adresses = new ArrayList<Adresse>();
	public List<Adresse> getAdresses() {
		return adresses;
	}


	public void setAdresses(List<Adresse> adresses) {
		this.adresses = adresses;
	}







	private Client client;
	private Adresse adresse;
	private  ApplicationContext context;
	@Autowired
	private AdresseService adresseService;
	
	@Autowired
	private ClientService clientService;
	
	LocalDate inputDate = LocalDate.of(1993,02,18);
	
	@Override
	public String execute()throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		adresseService  = (AdresseService) context.getBean("AdresseServiceImpl");
		clientService = (ClientService) context.getBean("ClientService");
		adresses = adresseService.getListAdresse();
		clients = clientService.getListClient();
			
		return LOGIN;
	}

	
	public List<Client> getClients() {
		return clients;
	}


	public void setClients(List<Client> clients) {
		this.clients = clients;
	}


	public String listClient() {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		adresseService  = (AdresseService) context.getBean("AdresseServiceImpl");
		clientService = (ClientService) context.getBean("ClientService");
		adresses = adresseService.getListAdresse();
		clients = clientService.getListClient();
		return SUCCESS;
	}




	@Override
	public Client getModel() {
		// TODO Auto-generated method stub
		return client;
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
