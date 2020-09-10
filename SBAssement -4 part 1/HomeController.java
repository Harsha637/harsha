package com.springtask.demo;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.hibernate.Query;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springtask.demo.dao.Teamdao;
import com.springtask.demo.model.Team;




@Controller
public class HomeController {

@Autowired
Teamdao dao;



@RequestMapping(value="/home")
public String home(Model model)
{
return "home";
}

@RequestMapping(value="/display")
public String display(Model model,@ModelAttribute Team team)
{
String status=dao.InsertTeam(team);
model.addAttribute("status",status);
return "display";
}
@RequestMapping(value="/search")
public String update()
{
return "search";
}
int playerId=0;
@RequestMapping(value="/SearchbyId")
public String getbyId(Model model,@RequestParam("playerId") String playerId)
{
	int playerId1=Integer.parseInt(playerId);
	this.playerId=playerId1;
	Team team=dao.TeamByid(playerId1);
	model.addAttribute(team);
	return "search";
}
@RequestMapping(value="/updateData")
public String updateData(@ModelAttribute Team team)
{
team.setPlayerId(playerId);
dao.updateplayerById(team);
return "search";
}
@RequestMapping(value="/deleting")
public String deleting()
{
return "deleting";
}

@RequestMapping(value="/deletebyId")
public String delete1(Model model,@RequestParam ("playerId") int playerId)
{
String status1=dao.deletebyid(playerId);
model.addAttribute("status1",status1);

return "delete";
}

@RequestMapping(value="/deletebyName")
public String delete(Model model,@RequestParam ("playerName") String playerName)
{
String status2=dao.deletebyname(playerName);
model.addAttribute("status2",status2);

return "delete";
}

@RequestMapping(value="/searchbyteam")
public String search4(Model model,@RequestParam String playerteam)
{
List<Team> status4=dao.getbyTeamName(playerteam);

model.addAttribute("status4",status4);
return "displayall";
}


}

