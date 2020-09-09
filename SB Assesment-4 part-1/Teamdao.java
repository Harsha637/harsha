package com.spring.demo.dao;



import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring.demo.model.Team;

@Transactional
public class Teamdao {


@Autowired
SessionFactory factory;


public Teamdao() {
// TODO Auto-generated constructor stub
}


public Teamdao(SessionFactory factory) {
super();
this.factory = factory;
}


public String saveTeam(Team team){
try{
Session session=factory.getCurrentSession();
session.save(team);
return "Author Created";
}
catch (Exception e) {
// TODO: handle exception
e.printStackTrace();
}

return "cannot create team";
}

public Team getTeamById(int teamId){
try{
Session session=factory.getCurrentSession();
Team team=(Team)session.get(Team.class,teamId);
return team;
}
catch (Exception e) {

e.printStackTrace();
}

return null;
}
public Team getTeamByName(String teamName){
try{
Session session=factory.getCurrentSession();
Team team=(Team)session.get(Team.class,teamName);
return team;
}
catch (Exception e) {

e.printStackTrace();
}

return null;
}



public String updateTeamById(Team team){
try{
Session session=factory.getCurrentSession();
session.update("Team",team);
return "Team Updated";
}
catch (Exception e) {

e.printStackTrace();
}

return "Cannot Update Team";
}

public String DeleteTeamById(int teamId)
{
	try {
		Session session=factory.getCurrentSession();
		session.delete("Team", teamId);
		
		return "Team deleted";
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return "Not deleted";
	
}
public String UpdateTeambyName(String teamName)
{
	try {
		Session session=factory.getCurrentSession();
		session.delete("Teamname", teamName);
		
		return "Team deleted";
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return "Not deleted";
	
}



}