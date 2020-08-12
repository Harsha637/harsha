
public class Employee {
	int id;
	String name;
	String city;
	float sal;
	
	void init()
	{
	     id=1160;
		name="Harsha";
		city="Vijayawada";
	 sal=(float)26000.0;
	}
	void disp()
	{
		System.out.println("employee id "+id);
		System.out.println("employee Name "+name);
		System.out.println("employee city "+city);
		System.out.println("employee sal "+sal);
	}

	public static void main(String[] args) 
	{
		Employee e=new Employee();
		Employee e1=new Employee();
		e.disp();
		e1.id=101;
		e1.name="kumar";
		System.out.println(e1.id+e1.name);
	}

}
