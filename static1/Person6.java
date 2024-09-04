package com.evergent.corejava.static1;

public class Person6 {
//Static variable cannot change, if change then i will change globally
	static String name="ABC";
	int age=12;
	String address="hyd";
	public void display() {
		name="welcome";
		age=22;
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		
		
	}
	public static void main(String[] args) {
		Person6 p1=new Person6();
		p1.display();
		Person6 p2=new Person6();
		System.out.println(p2.name);
		

	}

}
