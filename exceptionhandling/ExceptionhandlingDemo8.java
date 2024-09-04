package com.evergent.corejava.exceptionhandling;


public class ExceptionhandlingDemo8 {
	String name=null;
	int k=2;
	public void myData()throws NullPointerException{
		System.out.println("one");
		System.out.println(name.length());
		int t=10/k;
		System.out.println(t);
		System.out.println("end");
	}
	public void myChange()throws NullPointerException {
		myData();
		System.out.println("complete");
	}
	public static void main(String[] args)throws NullPointerException {
		try {
		ExceptionhandlingDemo8 ed7= new ExceptionhandlingDemo8();
		ed7.myData();
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		
	}

}
