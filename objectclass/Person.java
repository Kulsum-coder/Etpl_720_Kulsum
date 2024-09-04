package com.evergent.corejava.objectclass;
//objject class-tostring()s
public class Person {
	String name;
	int age;
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
		
	}
	public String tostring() {
		return "name:" +name+"age"+age;
		
	}
	public class myPerson{
	public static void main(String[] args) {
		Person p1=new Person("bhanu",25);
		System.out.println(p1);
		System.out.println(p1.hashCode());//hashcode
	}

	}
}
