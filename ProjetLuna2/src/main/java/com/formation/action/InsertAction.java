package com.formation.action;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

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

@Action("/insert")
@ResultPath("/admin")
@Results({
	@Result(name = "success", location = "accueil.jsp"),
})
public class InsertAction extends ActionSupport implements ModelDriven<Adresse>{

	private static final long serialVersionUID = 1L;

	private Client client;
	private Adresse adresse;
	private static ApplicationContext context;
	@Autowired
	private AdresseService adresseService;
	LocalDate inputDate = LocalDate.of(1993,02,18);
	
	@Override
	public String execute()throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		adresseService  = (AdresseService) context.getBean("AdresseServiceImpl");
		Adresse adresse = new Adresse("rue","codepostal","ville");
		adresseService.createAdresse(adresse);
		
		
		return SUCCESS;
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
