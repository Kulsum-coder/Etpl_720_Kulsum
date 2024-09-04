package com.evergent.corejava.static1;
//static block
public class StaticBlock {
	static {
		System.out.println("hello");
	}
	 static public void display() {
		System.out.println("display");
	}

	public static void main(String[] args) {
		display();
	}

}
