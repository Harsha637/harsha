
public class Tail
{
	public static void main(String[] args) {
		
		int i=10024000;
		int c=0;
		while((i%10)==0)
		{
			c=c+1;
			i=i/10;
		}
		System.out.println("Tail of a number "+c);
		
	}

}
