package com.evergent.corejava.exceptionhandling;
//Finally is block,if exceptions is occur or not finally block will executed
public class ExceptionDemo4 {
	String name="null";
	public void myData() {
		try {
			System.out.println("one");
			System.out.println(name.length());
			System.out.println("end");
			
		}
		
		finally {
			System.out.println("Executed in a final block");
		}
	}
	public static void main(String[] args) {
		ExceptionDemo4 ed1 = new ExceptionDemo4();
		ed1.myData();
	}

}
