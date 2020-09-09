package com.spring.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Team {

@Id
int teamId;
String teamName;
String pname;
public Team(int teamId, String teamName, String pname, String city) {
	super();
	teamId = teamId;
	teamName = teamName;
	pname = pname;
	this.city = city;
}
@Override
public String toString() {
	return "Team [TeamId=" + teamId + ", TeamName=" + teamName + ", Pname=" + pname + ", city=" + city + "]";
}
public int getTeamId() {
	return teamId;
}
public void setTeamId(int teamId) {
	teamId = teamId;
}
public String getTeamName() {
	return teamName;
}
public void setTeamName(String teamName) {
	teamName = teamName;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	pname = pname;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Team() {
	// TODO Auto-generated constructor stub
}
String city;

}