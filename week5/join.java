package Week5;
class Thread9 implements Runnable{

@Override
public void run() {
for(int i=0;i<10;i++)
{
System.out.println(i+"  "+Thread.currentThread().getName());

try {
Thread.sleep(1000);
} catch (InterruptedException e) {
e.printStackTrace();
}
}

}

}


public class join {
	public void run() {
		for(int i=0;i<10;i++)
		{
		System.out.println(i+"  "+Thread.currentThread().getName());

		try {
		Thread.sleep(500);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
		}
	}
	

	public static void main(String[] args) {
		Thread9 demo1=new Thread9();
		Thread1 thd1=new Thread1();
		Thread.currentThread().setPriority(6); // main 6
		Thread t1=new Thread(demo1,"thread t1");
		t1.setPriority(8); // t1 8

		Thread t2=new Thread(thd1,"thread t2"); // main 6 t2 6
		t1.start();
		t2.start();
		

		try {
		t1.join(4000);
		//join t1 with current thread(MAIN)
		// current thread(MAIN) will wait till the joined thread(t1)
		//completes its execution or 4 secs whichever is frst
		} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}

		System.out.println("MAIN ENDS");

	}

}
