package jdbs;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.jdbc.DBConnection;
import com.jdbc1.productdetails;
import com.jdbc2.productdata;
public class gettallrecs {

	public ArrayList<productdetails> getProducts() {
		
		try {
			Connection con=DBConnection.getconnection();
			String sql="select * from product";
			PreparedStatement stat=con.prepareStatement(sql);
			ArrayList<productdetails> p=new ArrayList<>();
			ResultSet rs=stat.executeQuery();
			if(rs.next())
			{
				do
				{
					int proid= rs.getInt(1);
					String proname= rs.getString(2);
					int price= rs.getInt(3);

					productdetails pd=new productdetails(proid, proname, price);

					p.add(pd);
				}while(rs.next());
			}
			return p;

			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return null;
		
	}

}
