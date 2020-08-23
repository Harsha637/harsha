package jdbs;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbsconnect {

	
		 public static Connection getconnect()
		 {
			 
			 try{
				 Class.forName("oracle.jdbc.OracleDriver");
				 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl", "dxcfs","pass");
				 return con;
				 }
				 catch (Exception e) {
				 e.printStackTrace();
				 return null;
				 }

	}

}
