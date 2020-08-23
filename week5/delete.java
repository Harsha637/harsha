package Week5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class delete {

	public static void main(String[] args) {
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			try {
				Connection con=
                DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl","dxcfs","pass");
				String s="delete from student where no=?";
				PreparedStatement stat=con.prepareStatement(s);
				System.out.println("enter  no");
				Scanner in=new Scanner(System.in);
				
				int no=in.nextInt();
				
				stat.setInt(1, no);
				
				int res=stat.executeUpdate();
				if(res>0)
					System.out.println("recs deleted");

				
				
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		


	}

}
