
public class Userdef {
	String name;
	
	Userdef(String name)
	{
		this.name=name;
	}
	
	void test() {
		System.out.println(name);
	}

	public static void main(String[] args) {
		Userdef[] t=new Userdef[5];
		t[0]=new Userdef("harsha");
		t[0].test();
		t[1]=new Userdef("My data");
         t[1].test();
         t[2]=t[1];
         t[2].test();
         
         
		
		
		
		
	}

}
