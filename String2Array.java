
public class String2Array {
	String [][]d= {{"Mango","apple"},{"car","bus"},{"c","java"}};

	public void print(String o) 
	{
		if(o.equalsIgnoreCase("fruits"))
		{
			for(String fruits:d[0])
			{
				System.out.println(fruits);
			}
		}
		if(o.equalsIgnoreCase("animals"))
		{
			for(String animals:d[1])
			{
				System.out.println(animals);
			}
		}
		if(o.equalsIgnoreCase("languages"))
		{
			for(String languages:d[2])
			{
				System.out.println(languages);
			}
		}
	}
	public static void main(String[] args) {
		
		String2Array a=new String2Array();
		a.print("animals");
		
		

	}
}
