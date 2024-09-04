package com.evergent.corejava.wrapperclass;

public class WrapperClassDemo1 {

	public static void main(String[] args) {
	int a=10;//declaration of the data with primitive data type
	Integer i1=new Integer(a);//Auto data types object
	System.out.println(i1);
	int a1=i1.intValue();
	System.out.println(a1);
	
	
	}

}
