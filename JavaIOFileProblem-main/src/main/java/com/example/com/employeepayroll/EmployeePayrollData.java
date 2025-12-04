package com.example.com.employeepayroll;

public class EmployeePayrollData {
	
	
	int employeeId;
	String employeeName;
	double employeeSalary;
	
	EmployeePayrollData(int employeeId, String employeeName,double employeeSalary){
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	
	@Override
	public String toString() {
		return "\nEmployee ID :"+employeeId+"\nEmployee Name : "+employeeName+"\nEmployee Salary : "+employeeSalary;
	}

}
