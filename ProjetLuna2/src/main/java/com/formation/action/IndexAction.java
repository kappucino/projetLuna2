package com.formation.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import com.opensymphony.xwork2.ActionSupport;


@Action("/login")
@ResultPath("/admin")
@Result(name = "login", location = "client.jsp")
public class IndexAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return LOGIN;
	}
	
}
