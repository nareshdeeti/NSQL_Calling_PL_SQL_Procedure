package com.t7.test;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.t7.entity.Product;
import com.t7.utility.HIbernateUtil;

public class NSQL_Calling_Procedure_Test {

	public static void main(String[] args) {
		Session ses=null;
		NativeQuery query=null;
		//SQLQuery query=null;
        List<Product> list=null;
        //get session
        ses= HIbernateUtil.getSession();
        //query=(SQLQuery) ses.getNamedQuery("CALL_PROCEDURE");
        query=(NativeQuery) ses.getNamedQuery("CALL_PROCEDURE");
        query.setParameter(0,500);
        query.setParameter(1,1300);
        list=query.list();
        list.forEach(p->{
            System.out.println(p);
        });

		HIbernateUtil.closeSession(ses);
		HIbernateUtil.closeFactory();
	}

}
