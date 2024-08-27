package com.evergent.corejava.ram.application3;

public  class EmployeeInformation extends BankAccountDetails implements EmployeeInterface{
	int empno;
	double sal;
	String address;
	public void employeeinfo(int eno,float sal) {
		this.empno=eno;
		this.sal=sal;
		
	}
	public void employeeAddress(String add) {
		this.address=add;
		
	}
	
	public void employeeDetails() {
		System.out.println("Employee no:"+empno);
		System.out.println("Employee salary:"+sal);
		System.out.println("Employee address:"+address);
	}
	//abstract class implementation
	public void accountDetails() {
		System.out.println("my account details is :12345678");
		
	}
	public void show() {
		System.out.println("This is shpow local method");
	}
	public static void main(String[] args) {
		EmployeeInformation emp=new EmployeeInformation();
		emp.employeeinfo(100,50000);
		emp.employeeAddress("Banglore");
		emp.employeeDetails();
		//abstract class
		emp.accountDetails();
		emp.bankDetails();
		emp.show();
		//calling bank rbi with has a relation
		BankRBI rbi=new BankRBI();
		BankRBI rbi1=new BankRBI(3.3,3.3);
		BankRBI.getBankerDetails();
	}
}
