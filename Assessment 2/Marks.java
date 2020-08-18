package assessment2;
class MarksException extends Exception
{
	public MarksException()
	{
		System.out.println("Marks are invalid");
	}
}

public class Marks {
	
	void marks(int marks)throws MarksException {
		if(marks<0 || marks >100)
		{
			throw new MarksException();
		}
		else
		{
			System.out.println("your marks are "+marks);
		}
		
	}

	public static void main(String[] args) {
		
		Marks m=new Marks();
		try
		{
			m.marks(10);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
