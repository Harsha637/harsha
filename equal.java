
public class equal {
	
	boolean Myequals(char ch, char ch1) {
		
	if(!((ch==ch1) ||(ch==(ch1+32)) ||(ch==(ch1-32)))) 
	{
		return false;
		
     
	}
	else {
		    return true;
	}
		
}

	public static void main(String[] args) {
		
		equal e=new equal();
		
		System.out.println(e.Myequals('A','a'));
		}

}
