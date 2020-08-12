
public class Reverse {

	public static void main(String[] args) {
		int x=1234;
		int y,z,rev=0;
		y=x;
		while(y!=0)
		{
			z=y%10;
			rev=rev*10+z;
			y=y/10;
			
		}
		
     System.out.println(rev);
	}

}
