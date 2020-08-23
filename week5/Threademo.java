package Week5;

public class Threademo extends Thread{
	public void run()
	{
		System.out.println("run method");
		System.out.println("main method "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		
		Threademo threademo=new Threademo();
		threademo.start();
		System.out.println("main method "+Thread.currentThread().getName());
		
	}

}
