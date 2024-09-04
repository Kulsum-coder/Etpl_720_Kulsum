package com.evergent.corejava.JavaBeans;
import java.io.Serializable;
//getter and setter methods from constructor
public class Product implements Serializable {
	private int pno;
	private String pname;
	private double price;
	public Product(int pno,String pname,double price) {
		this.pno=pno;
		this.pname=pname;
		this.price=price;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
