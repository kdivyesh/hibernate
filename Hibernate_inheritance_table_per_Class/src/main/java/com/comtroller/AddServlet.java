package com.comtroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.ContractEmployee;
import com.model.Employee;
import com.model.EmployeeManager;
import com.model.RegularEmpolyee;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		Employee e1=new Employee();
		String name=request.getParameter("t1");
		e1.setEname(name);
		RegularEmpolyee re=new RegularEmpolyee();
		String rname =request.getParameter("t2");
		int sal =Integer.parseInt(request.getParameter("t3"));
		int bonus =Integer.parseInt(request.getParameter("t4"));
		re.setEname(rname);
		re.setSalary(sal);
		re.setBonus(bonus);
		ContractEmployee ce =new ContractEmployee();
		String cname =request.getParameter("t5");
		int pay =Integer.parseInt(request.getParameter("t6"));
		int period =Integer.parseInt(request.getParameter("t7"));
		ce.setEname(cname);
		ce.setPay_per_hour(pay);
		ce.setContract_period(period);
		try {
			EmployeeManager em =new EmployeeManager();
			String ack=em.insertData(e1, re, ce);
			pw.print(ack);
			
		} catch (Exception e) {
			// TODO: handle exception
			pw.print("error occured");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
