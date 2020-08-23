package Week5;

public class cloning {
	int x,y;
	cloning()
	{
		 x=100;
		 y=200;
	}
	public static void main(String[] args) {
		cloning c=new cloning();
		
		cloning d=c;
		System.out.println(c.x+" "+c.y);
		d.x=250;
		d.y=300;
		System.out.println(c.x+" "+c.y);
		System.out.println(d.x+" "+d.y);
		
	}

}
