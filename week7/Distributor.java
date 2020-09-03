package distributor;

import javax.persistence.Embeddable;

@Embeddable
public class Distributor {
	int distid;
	String distname;
	String distaddress;
	public int getDistid() {
		return distid;
	}
	public void setDistid(int distid) {
		this.distid = distid;
	}
	public String getDistname() {
		return distname;
	}
	public void setDistname(String distname) {
		this.distname = distname;
	}
	public String getDistaddress() {
		return distaddress;
	}
	public void setDistaddress(String distaddress) {
		this.distaddress = distaddress;
	}
	@Override
	public String toString() {
		return "Distributor [distid=" + distid + ", distname=" + distname + ", distaddress=" + distaddress + "]";
	}
	public Distributor(int distid, String distname, String distaddress) {
		super();
		this.distid = distid;
		this.distname = distname;
		this.distaddress = distaddress;
	}
	public Distributor()
	{
		
	}
	

}
