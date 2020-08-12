
public class Hasonly {
	
	boolean hasonly(String data)
	{
		char arr[]=data.toCharArray();
		boolean c=false;
		int b=0;
		for(int i=0;i<arr.length;i++)
		{
			if(!(arr[i]>='0' && arr[i]<='9'))
			{
			 
			 return false;
			}
		}
	     return true;
	
	}
	boolean ten(String data)
	{
		char arr[]=data.toCharArray();
		int c=0;
		boolean b=false;
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]>='0' && arr[i]<='9'))
			{
			 c=c+1;;
			}
			if(c==10)
			{
				return true;
			}
			
			
		}
		
		
		
	
		
		return false;
				
	}
	

	public static void main(String[] args) {
		Hasonly h=new Hasonly();
		System.out.println(h.hasonly("Har1234"));
		System.out.println(h.ten("H1234567899"));
		

	}

}
