
class cal
{
	int a=10;
	cal()
	{
		System.out.println("hello");
	}
	void add()
	{
		System.out.println("addition");
	}
	cal(int a)
	{
		System.out.println(a);
	}
}
class cal2 extends cal
{
	cal2(int a)
	{
		super(10);
		System.out.println("parent is called");
	}
	cal2()
	{
		System.out.println("Child class");
	}
		void mul()
		{
			System.out.println("mul");
			}
}
public class Inhertance1 {

	public static void main(String[] args) {
		cal2 c=new cal2(10);
		cal2 c1=new cal2();
		c.add();
		c.mul();
		cal2.a=20;
		
		
	}

}
