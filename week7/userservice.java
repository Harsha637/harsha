import java.util.Date;

import com.myapp.model.user.user;

import userdao.userdao;

public class userservice {
	public static void main(String[] args) {

		
		 
			user user2=new user(101,"admin",new Date(),true);
		
			userdao dao=new userdao();
         System.out.println(dao.userdata(user2));


			


		}

}
