import java.awt.Label;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;

import com.myapp.model.emp;

public class emp1dao {


SessionFactory factory=null;;

public emp1dao() {

factory=new Configuration().configure().buildSessionFactory();

}


public String generateEmployeeId(String fname,String lname){
String employeeId="";
String seqNum="";
int seqNumber=0;
try{
String sql="select seqemp.nextval from dual";


Session session= factory.openSession();
Query query=session.createSQLQuery(sql);

seqNumber=Integer.parseInt(query.getSingleResult().toString());

if(seqNumber < 100 && seqNumber >=10)
seqNum="0"+seqNumber;
else if(seqNumber<10)
seqNum="00"+seqNumber;
else
seqNum=""+seqNumber;

employeeId=fname.substring(0,2)+lname.substring(0,2)+seqNum;

return employeeId;
}
catch (Exception e) {
e.printStackTrace();
}

return "";
}



public String saveEmployee(emp emp)
{

try
{
Session session= factory.openSession();

 Transaction tx= session.beginTransaction();
  emp.setEmpId(generateEmployeeId(emp.getFirstName(),emp.getLastName()));

//System.out.println(employee.getEmpId());

session.save(emp);
tx.commit();
return "employee saved";
}
catch (Exception e) {
// TODO: handle exception
e.printStackTrace();
}

return "cannot create employee";
}
public List<emp> limit(int pageNumber,int pageSize)
{
	Session session= factory.openSession();
    Transaction tx= session.beginTransaction();
    Query<emp> query = session.createQuery("from emp", emp.class);
    query.setFirstResult((pageNumber - 1) * pageSize);
    query.setMaxResults(pageSize);

    List<emp> emp1 = query.list();
    session.getTransaction().commit();
    return emp1;
	
	
}
public List<emp> top(int index,int size)
{
	Session session= factory.openSession();
    Transaction tx= session.beginTransaction();
    Criteria c = session.createCriteria(emp.class);
    Query<emp> query = session.createQuery("from emp", emp.class);
    c.addOrder(Order.desc("age.value"));
    query = session.createQuery("from emp", emp.class);
    query.setFirstResult((index - 1) * size);
    query.setMaxResults(size);

    List<emp> emp1 = query.list();
    session.getTransaction().commit();
    return emp1;	
	
}

}
