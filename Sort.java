
public class Sort {
	void sortfun(int... x)
	{
		int temp;
		for(int i=0;i<x.length-1;i++)
		{
			for(int j=0;j<x.length-i-1;j++)
			{
				if(x[j]>x[j+1])
				{
					temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
				}
			}
		}
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}
	}

	public static void main(String[] args) {
		Sort sort=new Sort();
		sort.sortfun(9,2,3,4,5,6);
		
	}

}
