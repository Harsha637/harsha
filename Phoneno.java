package day5task;

public class Phoneno {

	public static void main(String[] args) {
		india d=new india();
		Brazil b=new Brazil();
		Norway n=new Norway();
		Quator q=new Quator();
		Turkey t=new Turkey();
		System.out.println("------------------India---------------------------- \n");
		System.out.println("The given Format is "+d.phonenoformat("+91-9878675435"));
		System.out.println("------------------Brazil---------------------------- \n");
		System.out.println("The given Format is "+b.phonenoformat("+55 15 78945-5645"));
		System.out.println("------------------Norway---------------------------- \n");
		System.out.println("The given Format is "+n.phonenoformat("+47-49-99-99-99"));
		System.out.println("------------------Quator---------------------------- \n");
		System.out.println("The given Format is "+q.phonenoformat("+974 3399-9999"));
		System.out.println("------------------Turkey---------------------------- \n");
		
		System.out.println("The given Format is "+t.phonenoformat("+90 509-999999"));

	}

}
