abstract class shape
{
	void draw()
	{
		
	}
}
class circle extends  shape
{
	void draw() {
		System.out.println("Area is of cicle");
		
	}
}
class triangle extends shape
{
	void draw() {
		
		System.out.println("area");
		
	}
}
public class Abstract {

	public static void main(String[] args)
	{
		circle c=new circle();
		c.draw();
	}

}
