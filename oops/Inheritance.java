package com.evergent.corejava.oops;
//multilple inheritance through classes
public class Inheritance extends Person{
	public void show() {
		System.out.println("Local Class");
	}

	public static void main(String[] args) {
		Inheritance i= new Inheritance();
		i.show();
		i.display();
		
		
		

	}

}
