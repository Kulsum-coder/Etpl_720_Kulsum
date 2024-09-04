package com.evergent.corejava.JavaBeans;

public class EmployeeImpl {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setEno(100);
		e1.setEname("abc");
		e1.setSal(5000);
		//Getting the values from getter method
		System.out.println("emp no:"+e1.getEno());
		System.out.println("emp name:"+e1.getEname());
		System.out.println("emp salary:"+e1.getSal());
		

	}

}
