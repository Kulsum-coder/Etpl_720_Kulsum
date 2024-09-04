package com.evergent.corejava.io.serilaize;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Product implements Serializable {

	private int pid;

	private String pname;
	private double price;
	public Product() {
		
	}

	 public Product(int i, String string, int j) {
		// TODO Auto-generated constructor stub
	}
	public Product(int pid, String pname, double price) {

		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}

	
	public int getPid() {
		return pid;
	}

	public String getPname() {
		return pname;
	}

	public double getPrice() {
		return price;
	}

}