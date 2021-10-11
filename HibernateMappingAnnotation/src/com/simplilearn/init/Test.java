package com.simplilearn.init;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Test {

	public static void main(String[] args) {
		
		SessionFactory factory=HibernateUtil.getSessionFactory();
		try {
			Session session=factory.openSession();
			
			
			List<EProduct> list=session.createQuery("from EProduct").list();
			//session.close();
			
			
			if(list==null) {
				System.out.println("no data avilable");
			}
			
			for(EProduct p:list) {
				System.out.println(p);
				
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
