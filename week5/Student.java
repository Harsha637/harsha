package Week5;

import java.io.Serializable;

public class Student implements Serializable {
	private String name;
	@Override
	public String toString() {
		return "Student [name=" + name + ", no=" + no + "]";
	}
	public Student(String name, int no) {
		super();
		this.name = name;
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	private int no;
	

}
