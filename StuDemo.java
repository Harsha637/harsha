package day5task;

public class StuDemo {
	private String name;
	private int rno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	
	public StuDemo(String name, int rno) {
		super();
		this.name = name;
		this.rno = rno;
	}
	public void disp()
	{
		System.out.println(name+""+rno);
	}
	

}
