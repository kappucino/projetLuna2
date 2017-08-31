package com.formation.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static final SessionFactory sessionFactory;
	
	
	static{
		
		
			sessionFactory = new Configuration().configure().buildSessionFactory();
				
		
	}
	
	public static SessionFactory getSessionFactory(){
		
		return sessionFactory;
		
	}
	
	public static void shutdown(){
		getSessionFactory().close();
	}
 	
}
