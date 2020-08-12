
public class Substring {
	
	String mySubStr(String data,int index)
	{
		
	int i=0;
	char arr[]=data.toCharArray();
	char arr1[]=new char[arr.length-index];
	
		for(i=0;i<arr.length;i++)
		{
			if(i==index)
			{
				
				for(int j=0;j<arr1.length;j++)
				{
					arr1[j]=arr[i];
					i=i+1;
				}
			}
		}
	
		String s=new String(arr1);
		return s;
	}
	String mySubStr(String data,int index,int ele)
	{
		int i=0;
		char arr[]=data.toCharArray();
		String c=" ";
		for(i=0;i<arr.length;i++)
		{
			if(i>=index && i<=(index+ele-1))
			{
				continue;
			}
			else
			{
				c=c+arr[i];
			}
			
		}
		
		return c;
		
		
	}
	int count(String data)
	{
		int b=0;
		char arr[]=data.toCharArray();
		
	    int c=0,c1=0;
	    char a=' ';
	    for(int i=0;i<arr.length;i++)
	    {
	    	c=0;
	    	for(int j=0;j<arr.length-i;j++)
	    	{
	    		if(arr[i]==arr[i+j])
	    		{
	    			c=c+1;
	    			
	    		}
	    	}
	    	if(c1<c)
	    	{
	    		c1=c;
	    	}
	    	a=arr[i];
	    }
	     System.out.println(a);
		return c1;
	}
		
	
	

	
	public static void main(String[] args) {
		Substring substring=new Substring();
		System.out.println(substring.mySubStr("Harsha kumar",2));
		System.out.println(substring.mySubStr("Hello world",2,4));
		System.out.println(substring.count("Harsha"));
		

	}

}
