package day5task;

public class Lowercase {
	
	String reverse(String data)
	{
		char arr[]=data.toCharArray();
		char arr1[]=new char[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			arr1[i]=arr[arr.length-i-1];
		}
		String s=new String(arr1);
		return s;
	}
	
	String toLowercase(String data)
	{
		char arr[]=data.toCharArray();
		for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]>='A' && arr[i]<='Z')
			 {
				 arr[i]=(char)((int)arr[i]+32);
			 }
			
			
		 }
		 String s=new String(arr);
		
		return s;
	}
	
	String toUppercase(String data)
	{
		char arr[]=data.toCharArray();
		for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]>='a' && arr[i]<='z')
			 {
				 arr[i]=(char)((int)arr[i]-32);
			 }
			
			
		 }
		 String s=new String(arr);
		
		return s;
	}
	String toCase(String data)
	{
		char arr[]=data.toCharArray();
		for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]>='a' && arr[i]<='z')
			 {
				 arr[i]=(char)((int)arr[i]-32);
			 }
			 else  if(arr[i]>='A' && arr[i]<='Z')
			 {
				 arr[i]=(char)((int)arr[i]+32);
			 }
			 
			
			
		 }
		 String s=new String(arr);
		
		return s;
		
		}
	
	 String toreversecase(String data)
	 {
		 char arr[]=data.toCharArray();
		 char arr1[]=new char[arr.length];
		 
		 for(int i=0;i<arr.length;i++)
			{
				 arr1[i]=arr[arr.length-i-1];
				 
			}
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr1[i]>='A' && arr1[i]<='Z')
			 {
				 arr1[i]=(char)((int)arr1[i]+32);
			 }
		}
		 
		 for(int j=0;j<arr.length;j++)
		 {
			
			 if(arr[j]>'A' && arr[j]<='Z')
				{
				 arr1[j]=(char)((int)arr1[j]-32);
					
				}
		}
		
		  String s=new String(arr1);
		 return s;
	 }
	
	

	public static void main(String[] args) {
		Lowercase l=new Lowercase();
		System.out.println(l.reverse("Harsha"));
		System.out.println(l.toLowercase("Harsha"));
		System.out.println(l.toUppercase("harsha"));
		System.out.println(l.toCase("hARSHA"));
		System.out.println(l.toreversecase("HelloWorld"));
		
		
		

	}

}
