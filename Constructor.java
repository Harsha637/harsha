class A
{
	int x;
	A(){
		x=50;
		System.out.println("test");
	}
	void disp(){
		
		x=60;
		System.out.println(x);
		
	}
	void disp2()
	{
		System.out.println(x);
	}
}
public class Constructor {
	
	

	public static void main(String[] args) {
		A a=new A();
		a.disp();
		new A().disp2();
		
	}

}
