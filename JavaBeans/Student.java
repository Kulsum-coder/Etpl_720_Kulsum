package com.evergent.corejava.JavaBeans;
import java.io.Serializable;
public class Student implements Serializable{
	private int sno;
	private String sname;
	private String address;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String toString() {
		return "Student no"+sno+"student name:"+sname+"student address:"+address;
		
	}
	
	

}
