package day5task;

public class Exceptiondemo1 {
	public static void main(String[] args) {
		
		try{
			int[] x={12,0,5};
			System.out.println(x[10]);
			try{
			System.out.println("line 3 ---"+(10/0));
			}
			
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
	

}
