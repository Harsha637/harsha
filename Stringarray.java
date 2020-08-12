
public class Stringarray {

	public static void main(String[] args) {
		
		String []a= {"fruits","Mangoes"};
		System.out.println(a[0]);
		String[] u=new String[3];
		u[0]="fruits";
		u[1]="languages";
		String[][] m={{"fruits","apple","mango"},{"c","c++"},{"animals","birds"}};
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[i].length;j++)
			{
				System.out.println(m[i][j]);
			}
		}

	}

}
