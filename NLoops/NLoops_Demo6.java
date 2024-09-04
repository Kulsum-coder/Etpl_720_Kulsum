package com.evergent.corejava.NLoops;

public class NLoops_Demo6 {

	public static void main(String[] args) {
		int count=25;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(" "+count);
				count--;
				
			}
			System.out.println();
		}

	}

}
