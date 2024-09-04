package com.evergent.corejava.oops;
public class MethodFlow {
	//No Argument no returntype
	public void display() {
		System.out.println("Hello");
	}
	//argument with no return type
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	//argument with returntype
	public int mydata(int c,int d) {
		return c*d;
	}
	//no argument with returntype
	public int myexchange() {
		return 100;
	}
	public static void main(String[] args) {
		MethodFlow mf=new MethodFlow();
		mf.display();
		mf.add(7, 1);
		int k =mf.mydata(3, 3);
		System.out.println(k);
		int e=mf.myexchange();
		System.out.println(e);
		
	}

}
