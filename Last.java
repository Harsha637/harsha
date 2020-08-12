
public class Last {
	
	String replaceLast(String var,char find , char replace)
	{
		char arr[]=var.toCharArray();
		int l=var.length();
		for(int i=0;i<l;i++)
		{
			find=arr[l-1];
			if(arr[i]==find) 
			{
				
				arr[i]=replace;
				
			}
		}
		System.out.println("The last char in a word is "+find);
		String var1=new String(arr);
		return var1;
	}

	public static void main(String[] args) {
		
		
		Last last=new Last();
		String l=last.replaceLast("Apple",'e','y');
		System.out.println(l);

	}

}
