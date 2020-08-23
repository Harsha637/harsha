package Week5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class validation {
	public static void main(String[] args) {
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			try {
				Connection con=
DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl","dxcfs","pass");
				String s="select *from usereg where username=? and pass=?";
				PreparedStatement stat=con.prepareStatement(s);
				Scanner sc=new Scanner(System.in);
				System.out.println("Enteruser name and password");
				String username=sc.next();
				String pass=sc.next();

				stat.setString(1, username);
				stat.setString(2, pass);
				ResultSet rs=stat.executeQuery();
				if(rs.next()){
					System.out.println("Welcome to Java World");
					}

				else
				{
					System.out.println("Invalid user or password");

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
