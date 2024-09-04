package com.evergent.corejava.string;

public class StringDemo1 {
//immutable case\
	//it will create location in heap memory
	public static void main(String[] args) {
		String str1=new String("JAVA");
		String str2=new String("JAVA");//using new keyword 
		if(str1==str2)
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
		if(str1.equals(str2))
			System.out.println("True");
		else
			System.out.println("False");

	}

}
