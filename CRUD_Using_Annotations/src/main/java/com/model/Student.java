package com.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;  
  
@Entity  
@Table(name= "student")   
public class Student {
@Id
@Column(name="Student Id")
int sid;
@Column(name="Student Name")
String sname;
@Column(name="Student Dept")
String sdept;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getSdept() {
	return sdept;
}
public void setSdept(String sdept) {
	this.sdept = sdept;
}



	

}
