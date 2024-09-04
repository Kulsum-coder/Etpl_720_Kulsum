package com.evergent.corejava.exceptionhandling;

public class ArrayIndexOutOfBoundException13 {
	
//array index out of bound index unchecked exception
	public static void main(String[] args) {
		int[] number= {1,4,6,7,8};
		try {
			System.out.println("accessing the elsement out of bound:"+number[10]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			
		}

	}

}
