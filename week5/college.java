package jdbs;

public class college {
	private String cName;
	private int cId;
	
	
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	
	public college(String cName,int cId ) {
		super();
		this.cId = cId;
		this.cName = cName;
		
	}
	
	@Override
	public String toString() {
		return "college [cId=" + cId + ", cName=" + cName +  "]";
	}
	public college()
	{
		
	}

}
