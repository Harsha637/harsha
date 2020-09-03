package com.app.empdao;
import java.util.ArrayList;



import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

import com.app.model.empdata;

public class empdao {
	SessionFactory factory=null;
	public empdao()
	{
		factory=new Configuration().configure().buildSessionFactory();
	}
	
	
	public ArrayList<empdata> filterdata()
	{
		
	try
	{
		
	Session session= factory.openSession();
	Transaction tx=session.beginTransaction();

	Criteria ct=session.createCriteria(empdata.class);
	

	ArrayList<empdata> data=(ArrayList<empdata>)ct.add(Restrictions.gt("empid", 101)).list();

	tx.commit();
	return data;
	}
	catch (Exception e) {
	e.printStackTrace();
	}
	finally {
	factory.close();
	}

	return null;

	}
	
	public ArrayList<empdata> getAllage()
	{
		
	try
	{
		
	Session session= factory.openSession();
	Transaction tx=session.beginTransaction();

	Criteria ct=session.createCriteria(empdata.class);
	


	ArrayList<empdata> data=(ArrayList<empdata>)ct.add(Restrictions.gt("age",40)).list();
	

	tx.commit();
	
	return data;
	}
	catch (Exception e) {
	e.printStackTrace();
	}
	finally {
	factory.close();
	}

	return null;

	}
	
	public ArrayList<empdata> getAllthings()
	{
		try
	{
		Session session= factory.openSession();
	Transaction tx=session.beginTransaction();
    Criteria ct=session.createCriteria(empdata.class);
	Criteria age=ct.add(Restrictions.gt("age", 40));
	Criteria city=ct.add(Restrictions.ilike("city","hyderabad"));
	ArrayList<empdata> emp=(ArrayList<empdata>)ct.list();
	
	
	

	tx.commit();
	
	return emp;
	
	}
	catch (Exception e) {
	e.printStackTrace();
	}
	finally {
	factory.close();
	}

	return null;

	}
	
	public ArrayList<empdata> getagedept()
	{
		try
	{
		Session session= factory.openSession();
	Transaction tx=session.beginTransaction();
    Criteria ct=session.createCriteria(empdata.class);
	Criteria age=ct.add(Restrictions.gt("age", 39));
	Criteria city=ct.add(Restrictions.ilike("dept","devoloper"));
	ArrayList<empdata> emp=(ArrayList<empdata>)ct.list();
	
	
	

	tx.commit();
	
	return emp;
	
	}
	catch (Exception e) {
	e.printStackTrace();
	}
	finally {
	factory.close();
	}

	return null;

	}

	


}
