package com.ecommerce;


import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory factory;
	
	static {
		try {
			StandardServiceRegistry standardRegistery=new StandardServiceRegistryBuilder().
					configure("hibernate.cfg.xml").build();
			Metadata metadata=new MetadataSources(standardRegistery).getMetadataBuilder().build();
			
			
			factory=metadata.getSessionFactoryBuilder().build();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return factory;
	}
}
