package day5task;

interface phnopin
{
	public boolean phonenoformat(String no);
}
abstract class country implements phnopin
{
	boolean hasonly(String data)
	{
		char arr[]=data.toCharArray();
				
		for(int i=0;i<arr.length;i++)
		{
			if(!(arr[i]>='0' && arr[i]<='9'))
			{
			 
			 return false;
			}
		}
	     return true;
	
	}
	String mySubStr(String data,int index,int ele)
	{
		int i=0;
		char arr[]=data.toCharArray();
		String c="";
		for(i=0;i<arr.length;i++)
		{
			if(i>=index && i<=ele)
			{
							
			   c=c+arr[i];
				continue;
			}
		
		}
		return c;
	
}
}
class india extends country 
{
	public boolean phonenoformat(String no)
	{
		
		int l=no.length();
		if(l==14)
		{
		  if((mySubStr(no,0,3).equals("+91-")))
		   {
			 if(hasonly(mySubStr(no,4,13)))
				{
					return true;
				}
			
		  }
		}
		
		return false;
	   
	}
}
class Brazil extends country
{
	public boolean phonenoformat(String no)
	{
		
		int l=no.length();
		char ar[]=no.toCharArray();
		if(l==17)
		{
		  if((mySubStr(no,0,6).equals("+55 15 ") ))
		   {
			
				if(ar[12]=='-')
				{
					if((hasonly(mySubStr(no,13,16))) && (hasonly(mySubStr(no,7,11))))
					{
						return true;
					}
				}
			
		  }
		}
		
			
			 return false;
		
	
	   
	}
}
class Norway extends country
{
	public boolean phonenoformat(String no)
	{
		char arr[]=no.toCharArray();
		if(no.length()==15)
		{
			if(mySubStr(no,0,6).equals("+47-49-"))
			{
				if((arr[9]=='-') && (arr[12]=='-'))
				{
					if(hasonly(mySubStr(no,7,8)) && (hasonly(mySubStr(no,10,11))) && (hasonly(mySubStr(no,13,14))))
					{
						return true;
					}
				}
			}
		}
		return false;
	}
}
class Quator extends country
{
	public boolean phonenoformat(String no)
	{
		char arr[]=no.toCharArray();
		if(no.length()==14)
		{
			if(mySubStr(no,0,4).equals("+974 "))
			{
				if(arr[9]=='-')
				{
					if((hasonly(mySubStr(no,5,8))) && (hasonly(mySubStr(no,10,14))))
					{
						return true;
					}
				}
			}
		}
		return false;
	}
}
 class Turkey extends country
{
	public boolean phonenoformat(String no)
	{
		char arr[]=no.toCharArray();
		if(no.length()==14)
		{
			if(mySubStr(no,0,7).equals("+90 509-"))
			{
				if(hasonly(mySubStr(no,8,13)))
				{
					return true;
				}
			}
		}
		if(no.length()==12)
		{
			if(mySubStr(no,0,4).equals("0509-"))
			{
				if(arr[8]=='-')
				{
					if((hasonly(mySubStr(no,5,7))) && (hasonly(mySubStr(no,9,11))))
					{
						return true;
					}
				}
			}
		}
		return false;
	}
}

