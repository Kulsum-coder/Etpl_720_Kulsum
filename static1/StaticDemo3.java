package com.evergent.corejava.static1;
//static method cannot access ninstatic variable, non static methods
public class StaticDemo3 {
	static String cname="india";
	String name="abc";
	static public void mydisplay() {//static method
		System.out.println("display");
	}
	public void mydata() {//non static method
		System.out.println("mydata");
	}

	public static void main(String[] args) {
		//Cannot make a static reference to the non-static method mydata() from the type StaticDemo3
		//mydata();
		//Cannot make a static reference to the non-static field name
		//System.out.println(name);
		System.out.println(cname);
		mydisplay();
		

	}

}
