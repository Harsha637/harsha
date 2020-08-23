package Week5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class retrieve {

	public static void main(String[] args) {
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			try {
				Connection con=
DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl","dxcfs","pass");
				String s="select *from student ";
				PreparedStatement stat=con.prepareStatement(s);
				
				
				ResultSet rs=stat.executeQuery();
				System.out.println("Name    No");
				if(rs.next())
				{
					do
					{
						System.out.println(rs.getString("name")+" "+rs.getInt("no"));	
					}while(rs.next());
					
			  }
				else
				{
					System.out.println("elements not fount");
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	}

	


	}


