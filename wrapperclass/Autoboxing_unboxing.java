package com.evergent.corejava.wrapperclass;

public class Autoboxing_unboxing {

	public static void main(String[] args) {
		int a=10;
		Integer i1= new Integer(a);
		System.out.println(a);
		//autoboxing of character
		char ch1='a';
		Character myc =new Character(ch1);
		
		//autounboxing of character
		char ch=myc.charValue();
		System.out.println("value of ch:"+ch);
		System.out.println("value of my character"+myc);
		
		
		
	}

}
