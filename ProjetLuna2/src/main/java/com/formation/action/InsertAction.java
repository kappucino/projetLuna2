package com.formation.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.formation.domain.Client;
import com.formation.service.ClientService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Action("/insert")
@ResultPath("/WEB-INF/pages")
@Results({
	@Result(name = "success", location = "insert.jsp"),
})
public class InsertAction extends ActionSupport implements ModelDriven<Client>{

	private static final long serialVersionUID = 1L;

	private Client client;
	
	@Autowired
	private ClientService clientService ;
	

	

	@Override
	public String execute()throws Exception {
		Client client = new Client(this.client.getNom(), this.client.getPrenom(), this.client.isCarte_fidele(),null, this.client.getAdresse());
		clientService.createClient(client);
		
		return SUCCESS;
	}

	

	public Client getClient() {
		return client;
	}



	public void setClient(Client client) {
		this.client = client;
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
		return client;
	}


	
	
}
