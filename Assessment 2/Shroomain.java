package assessment2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shroomain{
	
	 Map<String, List<cars>> carstore;
	public void  displayCarByShroomname(String Shroomname)
	{
	List<cars> Car=carstore.get(Shroomname);
	

	for(cars caR:Car){
	System.out.println(caR);
	}

    }

	public static void main(String[] args) {
		
		cars car1=new cars(" Ambassitor",1997);
		cars car2=new cars(" Tataindica",2000);
		cars car3=new cars(" Innova",2007);
		cars car4=new cars(" Ferrari",2010);
		List<cars> carS=new ArrayList<cars>();
		carS.add(car1);
		carS.add(car2);
		carS.add(car3);
		carS.add(car4);
		
		Showroom showroom=new Showroom("CARZ","vijayawada",carS);
		
		
		Shroomain main=new Shroomain();
		main.carstore=new HashMap<String,List<cars>>();
		main.carstore.put(showroom.getShroomname(), showroom.getCar());
		main.displayCarByShroomname("CARZ");

	}

}
