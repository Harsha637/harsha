package Week5;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Comfun {
	
	public static void main(String[] args) {
		
			
			String thisline=null;
			try {

			FileReader rd=new FileReader("data.txt");
			BufferedReader brd=new BufferedReader(rd);
			while((thisline=brd.readLine())!=null) {
			System.out.println(thisline.replace(",", "  "));
			}
			}

			catch (FileNotFoundException e) {
			e.printStackTrace();
			} catch (IOException e) {
			
			e.printStackTrace();
			}
}

	
	

}
