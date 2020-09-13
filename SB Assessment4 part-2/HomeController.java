package com.bootmvctask.bootmvctask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bootmvctask.bootmvctask.dao.DxcUsersDao;
import com.bootmvctask.bootmvctask.model.DxcUsers;

@Controller
public class HomeController {

	@Autowired
	DxcUsersDao userDao;

	@RequestMapping(value ="/")
	public String home() {
		return "home";
	}

	@PostMapping("/regdata")
	public String regdata(Model model, @ModelAttribute DxcUsers dxcUsers) {
		System.out.println(dxcUsers);
		String status = userDao.saveUser(dxcUsers);
		model.addAttribute("status", status);
		return "display";
	}
	
	@GetMapping("/login")
	public String getLogin(@RequestParam("userid") int userid, @RequestParam("username") String username,
			@RequestParam("password") String password, Model model) {
		System.out.println("Username : "+username);
		DxcUsers user = null;

		user = userDao.getUserInfo(userid);
		
		if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
			return "success";
		}

		model.addAttribute("message", "Login Failed Please Enter Valid User Info");
		return "Fail";
	}
	
	@GetMapping("/displayLogin")
	public String getLoginInfo() {
		return "userLogin";
	}
	@GetMapping("/pass")
	public String getSec(@RequestParam("userid") int userid,@RequestParam("security_question") String security_question,
			@RequestParam("security_answer") String security_answer,Model model) {
		DxcUsers user = null;

		user = userDao.getUserInfo(userid);
		
		if (security_question.equals(user.getSecurity_question()) && security_answer.equals(user.getSecurity_answer())) {
			model.addAttribute("userId", userid);
			return "Changepass";
		}

		model.addAttribute("message", "Login Failed Please Enter Valid User Info");
		
				return "forgotpassword";
		
	}
	@GetMapping("/forgotpass")
	public String getsecInfo() {
		return "forgotpassword";
     
}
	@GetMapping("/changepass")
	public String changpass(@RequestParam String password, @RequestParam String conformPass,@RequestParam("userid") int userId) {
		System.out.println("userId : "+userId);
		if(password.equals(conformPass)) {
			userDao.changePassword(password,userId);
			return "success";
		}
		return "ChangePass";
}
	/*@GetMapping("/error")
	public String errorpg() {
		return "forgotpassword";
	}*/
}
