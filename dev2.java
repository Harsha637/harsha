package day5task;

public class dev2 {
	
	
	public void saveData(Object obj)
	{
		if(obj instanceof AllowStorage )
		{
			System.out.println("save data");
		}
		else
		{
			System.out.println("Data storage not allowed on this object");
		}
	}

}
