package com.evergent.corejava.exceptionhandling;


public class ExceptionhandlingDemo7 {
	String name=null;
	int k=2;
	public void myData()throws NullPointerException{
		System.out.println("one");
		System.out.println(name.length());
		int t=10/k;
		System.out.println(t);
		System.out.println("end");
	}
	public static void main(String[] args) {
		try {
		ExceptionhandlingDemo7 ed7= new ExceptionhandlingDemo7();
		ed7.myData();
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		
	}

}
