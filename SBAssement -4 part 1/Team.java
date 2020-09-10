package com.springtask.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Team {

@Id
int playerId;
public Team(int playerId, String playerName, String playerteam) {
	super();
	this.playerId = playerId;
	this.playerName = playerName;
	this.playerteam = playerteam;
}
@Override
public String toString() {
	return "Team [playerId=" + playerId + ", playerName=" + playerName + ", playerteam=" + playerteam + "]";
}
String playerName;
String playerteam;
public int getPlayerId() {
	return playerId;
}
public void setPlayerId(int playerId) {
	this.playerId = playerId;
}
public String getPlayerName() {
	return playerName;
}
public void setPlayerName(String playerName) {
	this.playerName = playerName;
}
public String getPlayerteam() {
	return playerteam;
}
public void setPlayerteam(String playerteam) {
	this.playerteam = playerteam;
}
public Team() {
	// TODO Auto-generated constructor stub
}


}
