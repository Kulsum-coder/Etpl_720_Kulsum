package com.evergent.corejava.ram.application3;

public class BankRBI {
	static {
		System.out.println("welcome to employee details");
		
	}
	public BankRBI() {
		System.out.println("RBI bank home loan and intrest");
	}
	public BankRBI(double p,double r ) {
		System.out.println(p*r/100);
	}
	public static final void getBankerDetails() {
		System.out.println("Home loan intrest is 8.5");
		System.out.println("Personal loan intrest is 11%");
		
	}
}
