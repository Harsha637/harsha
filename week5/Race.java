package Week5;

class Hare implements Runnable
{

	@Override
	public void run() {
		for(int i=1;i<=100;i++)
		{
		System.out.println(i+ " Hare ");
	
		  if(i==90)
		  {
			  try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }

		try {
		Thread.sleep(100);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
		}
		
	}
	
}
class Tortoise implements Runnable
{
	public void run() {
		for(int i=1;i<=100;i++)
		{
		System.out.println(i+ " Tortoise ");

		try {
		Thread.sleep(200);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
		}
	}
	
}
public class Race extends Thread{
	
	
	public static void main(String[] args) {
		
		Hare h=new Hare();
		Tortoise t=new Tortoise();
		Thread t1=new Thread(h);
		Thread t2=new Thread(t);
		t1.start();
		t2.start();
		
		
		while(true)
		{
		if( !( t2.isAlive()))
		{
			t1.stop();
			System.out.println("Tortoise won");
			break;
			
			
		}
		if( !( t1.isAlive()))
		{
			t2.stop();
			System.out.println("Hare won");
			break;
			
			
		}
		}
	


	}

}
