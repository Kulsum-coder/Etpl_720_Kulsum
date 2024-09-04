package com.evergent.corejava.exceptionhandling;
//16.Try followed by either catch or finally block
//There is two exception in class developer should be handle one after one
public class ExceptionDemo3 {
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
	}
	public static void main(String[] args) {
		ExceptionDemo3 ed1 = new ExceptionDemo3();
		ed1.myData();
	}

}
