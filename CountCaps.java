
public class CountCaps {
	int countCaps(String data)
	{
		int count=0;
		char c[]=data.toCharArray();
		for(int i=0;i<data.length();i++)
		{
			if(c[i]>='A' && c[i]<='Z')
			{
				count=count+1;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		
		CountCaps c=new CountCaps();
		System.out.println(c.countCaps("Harsha Kumar"));
		

	}

}
