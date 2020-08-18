package assessment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Carmain {
	
	public static void main(String[] args) {
		
		Map<String, List<cars>> carstore;
		List<cars> car=new ArrayList<cars>();
		
		
		cars car1=new cars(" Ambassitor",1997);
		cars car2=new cars(" Tataindica",2000);
		cars car3=new cars(" Innova",2007);
		cars car4=new cars(" Ferrari",2010);
		cars car5=new cars(" Benz",2005);
		cars car6=new cars(" Swift Desire",2011);
		
		
		car.add(car1);
		car.add(car2);
		car.add(car3);
		car.add(car4);
		car.add(car5);
		car.add(car6);
		
		/*
		Collections.sort(car);

		for(cars car11:car)
		{
		System.out.println(car11);

		}*/
		
		Collections.sort(car);

		for(cars car11:car)
		{
		System.out.println(car11);

		}
		
	
		

	}

}
