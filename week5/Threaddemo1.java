package Week5;

public class Threaddemo1 extends Thread{
@Override
public void run() {
System.out.println("run method");
System.out.println("run method "+Thread.currentThread().getName());
}
public static void main(String[] args) {
Threaddemo1 td=new Threaddemo1();
//td.start();// dead
//td.start();

td.run();
td.run();
td.run();


System.out.println("main method "+Thread.currentThread().getName());
}

}
