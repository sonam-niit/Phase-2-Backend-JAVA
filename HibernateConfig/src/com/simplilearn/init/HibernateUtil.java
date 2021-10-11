package com.simplilearn.init;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

	private static SessionFactory factory;
	
	static {
		try {
			StandardServiceRegistry standardRegistery=new StandardServiceRegistryBuilder().
					configure("hibernate.cfg.xml").build();
			Metadata metadata=new MetadataSources(standardRegistery).getMetadataBuilder().build();
			
			factory=metadata.getSessionFactoryBuilder().build();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return factory;
	}
}
