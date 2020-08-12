class B
{
	int id;
	String name;
	 B(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	 void disp()
	 {
		 System.out.println(id+""+name);
		 
	 }
	
}



public class Autocon {

	public static void main(String[] args) {
		
		B b=new B(1,"Harsha");
		B b1=new B(2,"Kumar");
		b.disp();
		b1.disp();
		

	}

}
