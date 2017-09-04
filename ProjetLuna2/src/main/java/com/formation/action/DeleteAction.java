package com.formation.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.formation.domain.Adresse;
import com.formation.domain.Client;
import com.formation.service.AdresseService;
import com.formation.service.ClientService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Action("/delete")
@ResultPath("/admin")
@Results({
	@Result(name = "success", location = "client.jsp"),
})
public class DeleteAction extends ActionSupport implements ModelDriven<Client>{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private Client client;
	private Adresse adresse;
	private  ApplicationContext context;
	@Autowired
	private AdresseService adresseService;
	
	@Autowired
	private ClientService clientService;
	
	String code;
	
	public String getCode() {
		return code;
	}





	public void setCode(String code) {
		this.code = code;
	}





	@Override
	public String execute()throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		adresseService  = (AdresseService) context.getBean("AdresseServiceImpl");
		clientService = (ClientService) context.getBean("ClientService");
		System.out.println(getCode());
		clientService.deleteClient(getCode());
		
		
		return SUCCESS;
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





	public ClientService getClientService() {
		return clientService;
	}





	public void setClientService(ClientService clientService) {
		this.clientService = clientService;
	}





	@Override
	public Client getModel() {
		// TODO Auto-generated method stub
		return null;
	}

}
