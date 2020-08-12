
public class Zerocount {

	public static void main(String[] args) {
		
		int a=120050;
		int i;
		int count=0;
		i=a;
		while(i!=0)
		{
			
			if(i%10==0)
			{
				count=count+1;
			}
			i=i/10;
			
			
		}
		System.out.println("No of zeros is "+count);
		
		
		

	}

}
