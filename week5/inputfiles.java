package Week5;

import java.io.File;
import java.io.FileWriter;

public class inputfiles {
	
	public static void main(String[] args) {
		
		try
		{
			File file=new File("Harsha.txt");
			FileWriter fw=new FileWriter(file,true);
			fw.write("This is harsha");
			fw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	}
	

}
