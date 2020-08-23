package Week5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbs1 {

	public static void main(String[] args) {
   try
	{
	 Class.forName("oracle.jdbc.OracleDriver");
	 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl", "dxcfs","pass");
	 String sql="insert into student values('kumar',2)";

	 PreparedStatement stat=con.prepareStatement(sql);

	 stat.executeUpdate();
	 System.out.println("Inserted");
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
