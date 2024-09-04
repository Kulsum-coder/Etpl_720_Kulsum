package com.evergent.corejava.oops;
//encapsulation
public class Caluclation {
	int a=10;int b=20,c;
	public void addition() {
		c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		Caluclation c=new Caluclation();
		c.addition();
		
		
	}

}
