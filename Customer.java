
class Cust{
	int cno;
	String cfname;
	String lname;
	String city;
	static float sal;
	static int phno;
   public Cust(int cno, String cfname, String lname, String city,int phno,float sal) {
		
		this.cno = cno;
		this.cfname = cfname;
		this.lname = lname;
		this.city = city;
		this.sal=sal;
		this.phno=phno;
		
	}
   
  
	void disp() {
	   
	   System.out.println(cno);
	   System.out.println(cfname);
	   System.out.println(lname);
	   System.out.println(city);
	   System.out.println(sal);
	   System.out.println(phno);
	  
	  }
  }
public class Customer {

	public static void main(String[] args) {
		
		
		Cust cust=new Cust(1,"Harsha","Kumar","Vijayawada",99089876,100000.0f);
		Cust cust1=new Cust(2,"ravi","Kumar","Vijayawada",908746739,987600.0f);
		cust.disp();
		cust1.disp();
		
		
		

	}

	

}
