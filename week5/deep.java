package Week5;

import java.util.concurrent.Callable;

class clg implements Cloneable
{
	String clgname;
   int  id;
	public clg(String clgname,int id) {
		
		this.clgname = clgname;
		this.id =id;
	}
	void disp()
	{
		System.out.println(clgname+" "+id);
	}
	
	
	
}

public class deep  {

	public static void main(String[] args) {
		clg clg1=new clg("klu",1);
		
		clg1.disp();
		clg clg2=null;
		clg2 = (clg)clg1.disp();
		clg2.clgname="iit";
		clg2.id=2;
		clg2.disp();
		clg1.disp();
		
		
		

	}

}
