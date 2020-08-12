
public class Reversed {
	
	
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

	public static void main(String[] args) {
		Reversed reversed=new Reversed();
		System.out.println(reversed.reverse("Harsha Kumar"));
		

	}

}
