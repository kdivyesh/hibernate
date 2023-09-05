package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Student;
import com.model.StudentManager;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("t1"));
		String name=request.getParameter("t2");
		String dept=request.getParameter("t3");
		Student s=new Student();
		s.setSid(id);
		s.setSname(name);
		s.setSdept(dept);
		StudentManager sm =new StudentManager();
		String ack="";
		try {
			
			ack=sm.updataData(s);
			
			
		} catch (Exception e) {
			ack=e.getMessage();
		}
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println(ack);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		StudentManager sm =new StudentManager();
		String ack="";
		try {
			ack=sm.deleteData(id);	
		} catch (Exception e) {
			ack=e.getMessage();
		}
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println(ack);
		
		
		
	}

}
