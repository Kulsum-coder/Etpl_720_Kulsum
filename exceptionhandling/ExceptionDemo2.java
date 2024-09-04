package com.evergent.corejava.exceptionhandling;
//3.All exception are executed while abnormal conditions only
//4.Normal flow it wont execute any exceptions
//5.Once any exceptions are occurring in java then remains lines of code 
public class ExceptionDemo2 {
	String name="null";
	int k=0;
	public void myData() {
		try {
			System.out.println("one");
			System.out.println(name.length());
			int t=10/k;
			System.out.println(t);
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
		ExceptionDemo2 ed1 = new ExceptionDemo2();
		ed1.myData();
	}

}
