package com.spring.demo;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.demo.dao.Teamdao;
import com.spring.demo.model.Team;




@Controller
public class HomeController {

@Autowired
Teamdao dao;



@RequestMapping(value="/")
public String home(Model model)
{
return "home";
}

@RequestMapping(value="/display")
public String display(Model model,@ModelAttribute Team team)
{
String status=dao.saveTeam(team);
model.addAttribute("status",status);
return "display";
}

@RequestMapping(value="/update")
public String update()
{
return "update";
}


int teamId=0;
private String teamName;
@RequestMapping(value="/searchForUpdate")
public String searchForUpdate(Model model,@RequestParam("teamId") int teamId)
{ 
int teamId1=(teamId);
this.teamId=teamId1;
Team team=dao.getTeamById(teamId1);
model.addAttribute(team);
return "update";
}

@RequestMapping(value="/searchForUpdateName")
public String searchForUpdateName(Model model,@RequestParam("teamName") String teamName)
{ 

String teamName1=(teamName);
this.teamName=teamName1;
Team team=dao.getTeamByName(teamName);
model.addAttribute(team);
return "update";
}


@RequestMapping(value="/updateData")
public String updateData(@ModelAttribute Team team)
{
	team.setTeamId(teamId);
	dao.updateTeamById(team);
	return "update";
}

@RequestMapping(value="/DeletePage")
public String Deletedata(Model model,@RequestParam("TeamId") int TeamId)
{
	String status1=dao.DeleteTeamById(TeamId);
	model.addAttribute("status1",status1);
	return "delete";
	
}


}
