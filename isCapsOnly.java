
public class isCapsOnly {
	boolean isCaps(String data)
	{
		char a[]=data.toCharArray();
		int ct=0;
		boolean c=true;
		for(int i=0;i<data.length();i++)
		{
			if(a[i]>='A' && a[i]<= 'Z')
			{
				
			    ct=ct+1;
			    
			}
		}
		if(ct==data.length())
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	public static void main(String[] args) {
		
		isCapsOnly iscapsonly=new isCapsOnly();
		System.out.println(iscapsonly.isCaps("HaRSHA KUMAR"));

	}

}
