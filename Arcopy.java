
public class Arcopy{

	public static void main(String[] args) {
		int[] x=new int[] {1,2,3,4,5,6,7,8};
		int []y=new int[x.length];
		int[]m=new int[10];
		/*
		for(int i=0;i<x.length;i++)
		{
			y[i]=x[i];
		}
		
		for(int a:y)
		{
			System.out.println(a);
		}
		System.out.println("--------------");
		for(int z:x)
		{
			System.out.println(z);
		}  
		*/
		
		System.arraycopy(x,0,m,5,3);
		for(int n:m)
		{
			System.out.println(n);
		}
		

	}

}
