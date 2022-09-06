package com.sonata.assignment2;

public abstract class Eployee {

	int empId;
	String empName;
    Address a1 = new Address();
	double basicPay;
	int availableLeaves;
	
	public abstract double calSal();
}