package day5task;
interface flyer
{
	public void fly();
}
class person{}
class bird implements flyer
{
	public void fly()
	{
		System.out.println(" Bird Fly");
	}
}
class superman extends person implements flyer
{
	@Override
	public void fly()
	{
		System.out.println("superman flies");
	}
	
}
abstract class Aircraft implements flyer
{
	
}


public class InterfaceDemo1 extends Aircraft {
	
	public void fly()
	{
		System.out.println("Aeroplane flies");
	}

	public static void main(String[] args) {
		
		InterfaceDemo1 demo1=new InterfaceDemo1();
		superman s=new superman();
		s.fly();
		demo1.fly();
		
	}

}
