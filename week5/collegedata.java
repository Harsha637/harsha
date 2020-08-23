package jdbs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jdbc.DBConnection;

public class collegedata {
	public String createcollege(college college)
	{
		try
		{
		Connection connection=DBConnection.getconnection();
		String sql="insert into student values(?,?)";
		PreparedStatement stat=connection.prepareStatement(sql);;
		
			stat = connection.prepareStatement(sql);
			stat.setString(1, college.getcName());
			stat.setInt(2, college.getcId());
			
			

			int res= stat.executeUpdate();
			if(res>0)
			return "College Created";
			else
			return "College connot be Created";
			}
	      catch (Exception e) {
	
	    	  return "Exception "+e;
		
		}
		

		
	}

}
