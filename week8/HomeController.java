package com.springboot.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.springboot.dao.MyUsersDao;



@Controller
public class HomeController {


@Autowired
MyUsersDao dao;

@RequestMapping(value="/test")
public String home()
{
dao.saveUser(new MyUsers("test","pass"));
return "home";
}





}
