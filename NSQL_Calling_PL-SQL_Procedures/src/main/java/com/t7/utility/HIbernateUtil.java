package com.t7.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HIbernateUtil {
	private static SessionFactory factory;
	static {
		Configuration con=null;
		//bootstrap hb
		con=new Configuration().configure("/com/t7/cfgs/hibernate.cfg.xml");
		factory=con.buildSessionFactory();
	}
	public static Session getSession() {
		Session ses=null;
		if(factory!=null)
			ses=factory.openSession();
		return ses;
	}
	public static void closeSession(Session ses) {
		if(ses!=null)
			ses.close();
	}
	public static void closeFactory() {
		if(factory!=null)
			factory.close();
	}

}
