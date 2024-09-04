package com.evergent.corejava.constructors;
public class Employee2 {
	int eno;
	String ename;
	double sal;
	Employee2(){
		System.out.println("Default Constructor");
	}
	Employee2(int eno,String ename,double sal){
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;	
	}
	public void display() {
		System.out.println("enumber:"+eno);
		System.out.println("ename:"+ename);
		System.out.println("salary:"+sal);
	}
	public static void main(String[] args) {
		new Employee2();
		Employee2 emp=new Employee2(12, "avbc", 5500);
		emp.display();
		
		
	}

}
