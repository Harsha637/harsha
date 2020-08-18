package assessment2;

public class cars implements Comparable<cars> {
	
	private String name;
	private int year;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "cars [name=" + name + ", year=" + year + "]";
	}
	public cars(String name, int year) {
		super();
		this.name = name;
		this.year = year;
	}
	public cars()
	{
		
	}
	/*
	public int compareTo(cars o) {
		return  this.year-o.year;  
		} */
	public int compareTo(cars o) {
		return  this.name.compareTo(o.name) ;  
		}
	

}
