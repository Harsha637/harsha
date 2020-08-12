
public class Day5Task {
	String hasUpper(String data)
	{
		
		char a[]=data.toCharArray();
		String b="yes";
		int c=0;
		for(int i=0;i<data.length();i++)
		{
			if(a[i]>'A' && a[i]< 'Z')
			{
				
				c=c+1;
			}
			
			
		}
		if(c>0)
		{
			b="yes";
		}
		else
		{
			b="no";
		}
		return b;
		
	}

	public static void main(String[] args) {
		
		
		Day5Task day5task=new Day5Task();
		System.out.println(day5task.hasUpper("Harsha"));
		
		

	}

}
