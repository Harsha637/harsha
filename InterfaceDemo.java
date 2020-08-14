package day5task;

interface demo
{
	public void show();
}

public class InterfaceDemo implements demo{
	 public void show()
	 {
		 System.out.println("show mwthod");
	 }

	public static void main(String[] args) {
		InterfaceDemo interfacedemo=new InterfaceDemo();
		interfacedemo.show();
        
	}

}
