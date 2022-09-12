package com.sonata.Model;

public class Employee {
	    int empID;
	    String empName;
	    double empSal;
	   
	public  Employee(int empID, String empName, double empSal) {
		this.empID =empID;
		this.empName = empName;
		this.empSal = empSal;	
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
}