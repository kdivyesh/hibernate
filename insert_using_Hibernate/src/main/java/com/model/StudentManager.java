package com.model;
import jakarta.persistence.TypedQuery;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
public class StudentManager {
	
	
	public static String insertData(Student s)throws Exception {
		  SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		  Session session = factory.openSession();
		  
		  session.getTransaction().begin();
		  session.persist(s);
		  session.getTransaction().commit();
		  
		  session.close();
		  factory.close();
		  return "Data Inserted Successfully...";
	}
	
	 public List<Student> readData() throws Exception
	 {
	  SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	  Session session = factory.openSession();
	  
	  session.getTransaction().begin();
	  TypedQuery<Student>  qry=session.createQuery("select s from Student s",Student.class);
	  List<Student> list = new ArrayList<Student>();
	  list=qry.getResultList();
	  session.getTransaction().commit();
	  
	  session.close();
	  factory.close();
	  return list;
	 }
	 
	 
	 public String updataData(Student S) throws Exception
	 {
	  SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	  Session session = factory.openSession();
	  
	  session.getTransaction().begin();
	  Student s1=session.find(Student.class,S.sid);
	  s1.setSname(S.getSname());
	  s1.setSdept(S.getSdept());
	  session.merge(s1);
	  session.getTransaction().commit();
	  
	  session.close();
	  factory.close();
	  return "Data updated Successfully...";
	 }
	 
	 
	 
	 
	 

	public String deleteData(int id) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		  Session session = factory.openSession();
		  
		  session.getTransaction().begin();
		  Student s1=session.find(Student.class,id);
		 
		  session.remove(s1);
		  session.getTransaction().commit();
		  
		  session.close();
		  factory.close();
		  return "data deleted Successfully...";
		
	}
}


