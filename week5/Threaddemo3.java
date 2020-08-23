package Week5;
class Thread1 implements Runnable
{
	public void run() {
		for(int i=0;i<10;i++)
		{
		System.out.println("THREAD 1 CLASS "+Thread.currentThread().getName());

		try {
		Thread.sleep(1000);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
		}
	}
		
}

public class Threaddemo3  implements Runnable{
	
	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
		System.out.println("ThreadDemo1 CLASS "+Thread.currentThread().getName());

		try {
		Thread.sleep(1000);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
		}
		
	}
	

	public static void main(String[] args) {
		
		Threaddemo3 t=new Threaddemo3();
		Thread1 thd1=new Thread1();


		Thread t1=new Thread(t,"my thread");
		Thread t2=new Thread(thd1,"new Thread");
		t1.start();
		t2.start();
	}

	

}
