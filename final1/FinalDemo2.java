package com.evergent.corejava.final1;
class MyClass{
//final method cannont be oyverride
	final public void display() {
		System.out.println("all products");
	}
	
}

public class FinalDemo2 extends MyClass {
	//Cannot override the final method from MyClass
	public void display1() {
		System.out.println("null products");
	}
	

	public static void main(String[] args) {
		FinalDemo2 fd2=new FinalDemo2();
		fd2.display();
		

	}

}
