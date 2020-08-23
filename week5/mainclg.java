package jdbs;

public class mainclg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		college c=new college("Harsha",2);

		collegedata dao=new collegedata();
		System.out.println(dao.createcollege(c));
	}

}
