package com.evergent.corejava.final1;
//final class cannot inherited or extends
final class MyClass1{
	final  public void display() {
		 System.out.println("Display");
	 }
	}
//The type FinalDemo3 cannot subclass the final class MyClass
//public class FinalDemo3 extends MyClass{
             public class FinalDemo3 {
            	 public void show() {
            		 System.out.println("show");
             }
	public static void main(String[] args) {
		FinalDemo3 fd3 =new FinalDemo3();
		fd3.show();
	}
             }
             
