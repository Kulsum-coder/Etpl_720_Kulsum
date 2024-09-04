package com.evergent.corejava.StringImmutable;

public final class StringImmutable {
	private final String name;
	private final int age;
      public StringImmutable(String name,int age) {
		this.name=name;
		this.age=age;	
	}
	public String myName() {
		return name;
	}
	public int myAge() { 
		return age;
	}
	public class Mainperson{
		
	}
	public static void main(String[] args) {
		StringImmutable person=new StringImmutable("raju",25);
		System.out.println("name:"+person.myAge());
		System.out.println("age:"+person.myName());
		
		
		
		
		
		

	}

}
