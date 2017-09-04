package com.formation.action;

import java.security.SecureRandom;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
import com.formation.util.ConvertisseurLocalDate;
import com.formation.util.RandomString;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Action("/update")
@ResultPath("/admin")
@Results({ @Result(name = "SUCCESS", location = "update.jsp"), @Result(name = "update", location = "client.jsp") })
public class UpdateAction extends ActionSupport implements ModelDriven<Adresse> {

	private static final long serialVersionUID = 1L;

	private Client client;
	private Adresse adresse;
	

	static String code;

	public String getCode() {
		return code;
	}

	public void setCode(String code1) {
		code = code1;
	}

	private ApplicationContext context;
	@Autowired
	private AdresseService adresseService;

	@Autowired
	private ClientService clientService;

	List<Client> clients = new ArrayList<Client>();

	LocalDate inputDate = LocalDate.of(1993, 02, 18);

	@Override
	public String execute() throws Exception {
		setClient(clientService.find(code));
		return SUCCESS;
	}

	@Action("/updateClient")
	public String updateClient() {
		client.setDate(inputDate);
		getClient().setCode(code);
		getClient().setNom(client.getNom());
		getClient().setPrenom(client.getPrenom());
		getClient().setDate(inputDate);
		getClient().setCarte_fidele(client.isCarte_fidele());
		getClient().setAdresse(adresse);
		clientService.updateClient(getClient());
		return "update";
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

}
