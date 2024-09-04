package com.evergent.corejava.exceptionhandling;

public class ExceptionDemo5 {
	String name=null;
	public void myData() {
		try {
			System.out.println("one");
			System.out.println(name.length());
			System.out.println("end");
			
		}
		catch(NullPointerException e) {
			System.out.println(e);
			
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		ExceptionDemo5 ed1 = new ExceptionDemo5();
		ed1.myData();
	}

}
