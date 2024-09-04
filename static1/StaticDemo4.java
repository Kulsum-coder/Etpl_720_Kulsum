package com.evergent.corejava.static1;
//non static methods can access static methods and ariables
public class StaticDemo4 {
	static String cname="india";
	String name="abc";
	static public void display() {
		System.out.println("display");
	}
	public void data() {
		display();
		System.out.println("data");
	}

	public static void main(String[] args) {
		StaticDemo4 sd4=new StaticDemo4();
		sd4.data();
		

	}

}
