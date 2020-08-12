
public class Overload {
	
	void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	void sum(int a,char b)
	{
		System.out.println(a+b);
	}
	int sum(int a,int b,int c)
	{
		return a+b+c;
	}

	public static void main(String[] args) {
		Overload overload=new Overload();
		overload.sum(2, 3);
		overload.sum(2, 'A');
		sum(1,2,3);
		
		

	}

}
