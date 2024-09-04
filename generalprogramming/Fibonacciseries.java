package com.evergent.corejava.generalprogramming;

public class Fibonacciseries {

	public static void main(String[] args) {
		int n1=0;
		int num=10;
		int n2=1;
		int n3;
		for(int i=2;i<num;++i) {
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			if(n1==10) {
				System.exit(0);			}
				
			
		}

	}

}
