package com.evergent.corejava.oops;
class mydata{
	public void display() {
		System.out.println("Display local");
	}
}


public class Polymorphismoverriding extends mydata {
	public void data() {
		System.out.println("Dispaly main class");
	}

	public static void main(String[] args) {
		Polymorphismoverriding po=new Polymorphismoverriding();
		po.display();
		po.data();
		
	}

}
