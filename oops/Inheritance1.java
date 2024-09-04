package com.evergent.corejava.oops;
class persondata{
	public void mydata() {
		System.out.println("Local claass");
	}
}
class personinfo extends persondata{
	public void perinfo() {
		System.out.println("Mydata");
	}
}
public class Inheritance1 extends personinfo{
//multilevel inheritance through classes
// if we create a object for child we can access its parent and grand parent properties without creating objects for them.
	public void display() {
		System.out.println("my info");
	}

	public static void main(String[] args) {
		Inheritance1 i =new Inheritance1();
		i.display();
		i.perinfo();
		
	}

}
