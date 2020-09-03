package com.myapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class emp {

String firstName;
String lastName;
@Id
String empId;
int age;
public String getFirstName() {
return firstName;
}
public void setFirstName(String firstName) {
this.firstName = firstName;
}
public String getLastName() {
return lastName;
}
public void setLastName(String lastName) {
this.lastName = lastName;
}
public String getEmpId() {
return empId;
}
public void setEmpId(String empId) {
this.empId = empId;
}
public int getAge() {
return age;
}
public void setAge(int age) {
this.age = age;
}
public emp(String firstName, String lastName, String empId, int age) {
super();
this.firstName = firstName;
this.lastName = lastName;
this.empId = empId;
this.age = age;
}

public emp() {
// TODO Auto-generated constructor stub
}
@Override
public String toString() {
return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", empId=" + empId + ", age=" + age
+ "]";
}



}