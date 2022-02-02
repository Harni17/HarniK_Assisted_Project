package com.HarniK.Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Harni.Entity.Ecom_Product;

public class HibernateUtil {
	 public static SessionFactory buildSessionFactory() {
		    
		    
		    Configuration cfg = new Configuration();
		    cfg.configure("hibernate.cfg.xml");
		    cfg.addAnnotatedClass(Ecom_Product.class);
		    
		    
		    
		    SessionFactory sf = cfg.buildSessionFactory();

		    return sf;
		  }

}
