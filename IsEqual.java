
public class IsEqual {
	boolean equal(String str1 , String str2)
	{
	
		boolean c=false;
		char a[]=str1.toCharArray();
		char b[]=str2.toCharArray();
	    if(str1.length()==str2.length())
	    {
	    		
	       for(int i=0;i<str1.length();i++)
		     {
			
		      if(!((a[i]==b[i]) || (a[i]==(b[i]+32)) || (a[i]==(b[i]-32))))	
			{
				return false;
		     }
			 
		}
			
			
		}
	    else
	    {
	    	return false;
	    }
	    
		
		 return true;
	    }
		
		
	

	public static void main(String[] args) {
		
		
		IsEqual e=new IsEqual();
		System.out.println(e.equal("Harsha","hrasha"));
		

	}

}
