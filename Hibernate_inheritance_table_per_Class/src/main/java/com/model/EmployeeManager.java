package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeManager {
	 public String insertData(Employee e1,RegularEmpolyee r1,ContractEmployee c1)throws Exception
	 {
	  SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	  Session session = factory.openSession();
	  session.getTransaction().begin();
	  session.persist(e1);
	  session.persist(r1);
	  session.persist(c1);
	  session.getTransaction().commit();
	  session.close();
	  factory.close();
	  return "insertion done successfully";
	 }
	

}
