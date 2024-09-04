package com.evergent.corejava.oops;
//it can be done by object creation of the existing ibject in same package
public class Hasarelation{
	public void show() {
		System.out.println("computer details");
	}

	public static void main(String[] args) {
		Hasarelation has=new Hasarelation();
		has.show();
		Person p=new Person();
		p.display();
		}

	}


