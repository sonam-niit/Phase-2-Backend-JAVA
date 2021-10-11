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

/**
 * Servlet implementation class ProductDetails
 */
@WebServlet("/details")
public class ProductDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SessionFactory factory=HibernateUtil.getSessionFactory();
		PrintWriter out=response.getWriter();
		try {
			
			Session session=factory.openSession();
			List<EProduct> list=session.createQuery("from EProduct").list();
			for(EProduct p:list) {
				out.println("ID: "+String.valueOf(p.getID())+" "+"Name: "+String.valueOf(p.getName())+
						" Price: "+String.valueOf(p.getPrice())+" Date: "+String.valueOf(p.getDateAdded())+" ");
				ProductParts parts=p.getParts();
				out.println("Parts: "+parts.getHdd()+" "+parts.getCpu()+" "+parts.getRam());
			}
		} catch (Exception e) {
			e.printStackTrace();
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
