package Week5;

class Thread2 implements Runnable{

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


public class Threademo4 implements Runnable{

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

public static void main(String[] args) {

Threademo4 demo1=new Threademo4();
Thread1 thd1=new Thread1();

Thread.currentThread().setPriority(6);




Thread t1=new Thread(demo1,"thread t1");
Thread t2=new Thread(thd1,"thread t2");
t1.start();
t2.start();

System.out.println("t1 p ->"+t1.getPriority());
System.out.println("t2 p ->"+t2.getPriority());

System.out.println("main p"+Thread.currentThread().getPriority());

// Max min norm

//1-10
}

}

