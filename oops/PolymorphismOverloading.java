package com.evergent.corejava.oops;
//overoading same methods with diff parameter and within same class

public class PolymorphismOverloading {
	public void logindata() {
		System.out.println("login data");
	}
	public void logindata(String uname,int age) {
		System.out.println("uname:"+uname);
		System.out.println("age:"+age);
	}
	public void logindata(int pass,String uname) {
		System.out.println("Password:"+pass);
		System.out.println("Uname:"+uname);
	}

	public static void main(String[] args) {
		PolymorphismOverloading po =new PolymorphismOverloading();
		po.logindata();
		po.logindata("abc", 23);
		po.logindata(345, "abc");
		
		
	}

}
