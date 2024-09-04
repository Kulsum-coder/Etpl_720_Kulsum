package com.evergent.corejava.arrays;

public class DDArray2 {

	public static void main(String[] args) {
		int arr[][]=new int[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(arr[i]==arr[j]) {
					arr[i][j]=7;
				}
				else {
					arr[i][j]=1;				}
			}
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
