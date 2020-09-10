package com.springtask.demo.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.springtask.demo.model.Team;

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


public String InsertTeam(Team team){
try{
Session session=factory.getCurrentSession();
session.save(team);
return "Team Created";
}
catch (Exception e) {
// TODO: handle exception
e.printStackTrace();
}

return "cannot create Team";
}

public Team TeamByid(int playerId){
try{
Session session=factory.getCurrentSession();
Team team=(Team)session.get(Team.class,playerId);
return team;
}
catch (Exception e) {
// TODO: handle exception
e.printStackTrace();
}

return null;
}
public String updateplayerById(Team team){
try{
Session session=factory.getCurrentSession();

System.out.println("Team"+team);
session.update("Team",team);
return "Team Updated";
}
catch (Exception e) {
// TODO: handle exception
e.printStackTrace();
}

return "Cannot Update Team";
}
public Team deletebyId(int playerId)
{
	try{
		Session session=factory.getCurrentSession();

		Team team=(Team)session.get(Team.class,playerId);
		session.delete("Team",team);
		return team;
		}
		catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		}
	return null;
	
}
public String deletebyid(int playerId){
try
{

String hql="delete from Team g where g.playerId = :playerId";
Session session= factory.openSession();
Query query=(Query) session.createSQLQuery(hql);
query.setParameter("playerId",playerId);
    int res=query.executeUpdate();
if(res>0)
return "Record is Successfully deleted!!!!";
}


catch (Exception e) {
e.printStackTrace();

}

return "Unable to  delete ";
}
public String deletebyname(String playerName){
try
{

String hql="delete from Team f where f.playerName = :playerName";
Session session= factory.openSession();
Query query=(Query) session.createSQLQuery(hql);
query.setParameter("playerName",playerName);
    int res=query.executeUpdate();
if(res>0)
return " deleted";
}


catch (Exception e) {
e.printStackTrace();

}

return "unable to delete";
}

public List<Team> getbyTeamName(String playerteam) {

try{
Session session=factory.getCurrentSession();
Criteria crit = session.createCriteria(Team.class);
Query query=session.createQuery("from Team e where e.playerteam=:playerteam");
query.setParameter("playerteam",playerteam);
ArrayList<Team> team=(ArrayList<Team>) query.list();
return team;

}
catch (Exception e) {
// TODO: handle exception
e.printStackTrace();
}
return null;
}



}






