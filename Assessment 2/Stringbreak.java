package assessment2;

public class Stringbreak {
	void Break(String data) {
		
		char arr[]=data.toCharArray();
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==' ')
			{
				count=count+1;
			}
		}
		String[] s=data.split(" ",count+1);
		for (String a : s) 
            System.out.println(a);
		
		
	}
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
	
	void  breakreverse(String data)
	{
		char arr[]=data.toCharArray();
        int count=0;
	    for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==' ')
			{
				count=count+1;
			}
		}
		String[] s=data.split(" ",count+1);
		String rev=" ";
		String r=" ";
		
		for(int i=0;i<s.length;i++)
		{
			rev=rev+reverse(s[i])+r;
		}
		
		String rev1[]=rev.split(" ");
			for(String a:rev1)
			{
				System.out.println(a);
			}
		
	}

	public static void main(String[] args) {
		Stringbreak stringbreak=new Stringbreak();
		stringbreak.Break("This is java programming");
		stringbreak.breakreverse("This is java programming");
		

	}

}
