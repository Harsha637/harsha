
public class Stringtask1 {
	
	
	String RepalceFirst(String var,char find,char replace)
	{
		char arr[]=var.toCharArray();
		
		
		for(int i=0;i<var.length();i++)
		{
			find=arr[0];
			if(arr[i]==find)
			{
				arr[i]=replace;
			}
		}
		System.out.println("First char in a given string"+find);
		String var1=new String(arr);
		return var1;
		
	}

	public static void main(String[] args) {
		
		
		Stringtask1 stringtask1=new Stringtask1();
		String x=stringtask1.RepalceFirst("Apple", 'A','b');
		System.out.println(x);
		

	}

}
