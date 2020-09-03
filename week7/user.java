package com.myapp.model.user;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "User_demo")
public class user {
@Id
@Column(name = "uid_demo")
private int uid;
private String uname;
private Date dob ;
@Type(type="yes_no")
private boolean isActive;
public int getUid() {
return uid;
}
public void setUid(int uid) {
this.uid = uid;
}
public String getUname() {
return uname;
}
public void setUname(String uname) {
this.uname = uname;
}
public Date getDob() {
return dob;
}
public void setDob(Date dob) {
this.dob = dob;
}
public boolean isActive() {
return isActive;
}
public void setActive(boolean isActive) {
this.isActive = isActive;
}
public user(int uid, String uname, Date dob, boolean isActive) {
super();
this.uid = uid;
this.uname = uname;
this.dob = dob;
this.isActive = isActive;
}
@Override
public String toString() {
return "User [uid=" + uid + ", uname=" + uname + ", dob=" + dob + ", isActive=" + isActive + "]";
}
public user() {

}
}