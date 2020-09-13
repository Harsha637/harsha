package com.bootmvctask.bootmvctask.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class DxcUsers {
	
	
	@Id
	 @Column(length = 5)
	
	int userid;
	 @Column(length = 15)
	String username;
	 @Column(length = 15)
	String password;
	 @Column(length = 50)
	String security_question;
	 @Column(length = 15)
	String security_answer;
	
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSecurity_question() {
		return security_question;
	}
	public void setSecurity_question(String security_question) {
		this.security_question = security_question;
	}
	public String getSecurity_answer() {
		return security_answer;
	}
	public void setSecurity_answer(String security_answer) {
		this.security_answer = security_answer;
	}
	@Override
	public String toString() {
		return "Dxc_Users [userid=" + userid + ", username=" + username + ", password=" + password
				+ ", security_question=" + security_question + ", security_answer=" + security_answer + "]";
	}
	public DxcUsers(int userid, String username, String password, String security_question, String security_answer) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.security_question = security_question;
		this.security_answer = security_answer;
	}
	public DxcUsers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
