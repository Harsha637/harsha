package day5task;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Done");
			System.out.println(e);
		}
     System.out.println("Hello");
	}

}
