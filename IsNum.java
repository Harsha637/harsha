
public class IsNum {
	boolean isNum(String data)
	{
		boolean b=true;
		int count=0;
		char c[]=data.toCharArray();
		for(int i=0;i<data.length();i++)
		{
			if(c[i]>=48 && c[i]<=57)
			{
				count=count+1;
			}
		}
		if(count>0)
		{
			b=true;
		}
		else
		{
			b=false;
		}
		return b;
		}

	public static void main(String[] args) {
		
		IsNum isnum=new IsNum();
		System.out.println(isnum.isNum("harsha29"));
		

	}

}
