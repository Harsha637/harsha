package userdao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.myapp.model.user.user;



public class userdao {
	

	
		public String userdata(user user1)
		{
		SessionFactory factory=null;
		try
		{
		 factory=new Configuration().configure().buildSessionFactory();
		Session session= factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(user1);
		tx.commit();
		 
		return "user saved";

		}
		catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		}
		finally {
		factory.close();
		}

		return "cannot save user";
		}
	

}
