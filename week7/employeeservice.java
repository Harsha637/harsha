import java.util.ArrayList;

import org.hibernate.mapping.List;

import com.app.empdao.empdao;
import com.app.model.empdata;
import com.myapp.model.emp;

public class employeeservice {

	public static void main(String[] args) {
		emp1dao dao=new emp1dao();
		//emp employee=new emp("deepak", "chahar", "", 25);
		//System.out.println(dao.saveEmployee(employee));
		
		/*ArrayList<emp> emp1 = (ArrayList<emp>) dao.limit(1, 3);
        for (emp Emp : emp1) {
            System.out.println(Emp);
        }
        */
		ArrayList<emp> emp1 = (ArrayList<emp>) dao.top(1, 5);
        for (emp Emp : emp1) {
            System.out.println(Emp);
        }
		
		}


	}


