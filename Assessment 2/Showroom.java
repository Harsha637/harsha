package assessment2;

import java.util.List;

public class Showroom {
	
	private String Shroomname;
	private String city;
	List<cars> Car;
	public String getShroomname() {
		return Shroomname;
	}

    public void setShroomname(String shroomname) {
		Shroomname = shroomname;
	}
   public String getCity() {
		return city;
	}
  public void setCity(String city) {
		this.city = city;
	}
  public List<cars> getCar() {
		return Car;
	}
 public void setCAR(List<cars> Car) {
		Car = Car;
	}
 
public Showroom(String shroomname, String city, List<cars> cAR) {
	super();
	Shroomname = shroomname;
	this.city = city;
	Car = Car;
}


	@Override
public String toString() {
	return "Showroom [Shroomname=" + Shroomname + ", city=" + city + ", Car=" + Car + "]";
}

	public Showroom() {
		
	}
		
}


