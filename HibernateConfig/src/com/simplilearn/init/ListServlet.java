package com.simplilearn.init;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Servlet implementation class ListServlet
 */
@WebServlet("/list")
public class ListServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SessionFactory factory=HibernateUtil.getSessionFactory();
		try {
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			List<EProduct> list=session.createQuery("from EProduct").list();
			//session.close();
			
			PrintWriter out=response.getWriter();
			if(list==null) {
				out.println("no data avilable");
			}
			out.println("Product List");
			for(EProduct p:list) {
				System.out.println(p);
				out.println("Id: "+String.valueOf(p.getId())+" Name: "+String.valueOf(p.getName())
				+" Price: "+String.valueOf(p.getPrice())+" Date: "+String.valueOf(p.getDate_added()));
			}
			
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
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
