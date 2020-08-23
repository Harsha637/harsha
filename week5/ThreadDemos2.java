package Week5;
class Threademos1 implements Runnable{

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


public class ThreadDemos2 implements Runnable{

@Override
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

public class Threademo5 {

	public static void main(String[] args) {
		

	}

}
