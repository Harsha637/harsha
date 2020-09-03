import java.util.ArrayList;

import com.app.empdao.empdao;
import com.app.model.empdata;

public class empservice {

	public static void main(String[] args) {
		
		empdao dao=new empdao();
	
		/*ArrayList<empdata> empdata1=(ArrayList<empdata>)dao.getAllthings();

		for(empdata emp:empdata1){
		System.out.println(emp);
		}*/
		
		ArrayList<empdata> empdata1=(ArrayList<empdata>)dao.getagedept();

		for(empdata emp:empdata1){
		System.out.println(emp);

	}

}
}
