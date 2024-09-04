package com.evergent.corejava.constructors;

public class Employee3 {
	int eno;
	String ename;
	double sal;
	Employee3(){
		System.out.println("Default Constructor");
	}
	Employee3(int eno1,String ename1,double sal1){
		eno=eno1;
		ename=ename1;
		sal=sal1;	
	}
	public void display() {
		System.out.println("enumber:"+eno);
		System.out.println("ename:"+ename);
		System.out.println("salary:"+sal);
	}
	public static void main(String[] args) {
		new Employee3();
		Employee3 emp=new Employee3(12, "avbc", 5500);
		emp.display();
		
		
	}

}
