package Week5;

public class Threaddemo2 extends Thread{
 
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
				} catch (InterruptedException e) {

				e.printStackTrace();
				}
		}
		
	}
	public static void main(String[] args) {
		
		Threaddemo2 td=new Threaddemo2();
		td.start();
		

	}

}
