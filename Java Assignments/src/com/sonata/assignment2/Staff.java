package com.sonata.assignment2;

public class Staff extends Eployee{
	String position;
	public Staff(){
		
	}
	public Staff(String pos) {
		this.position = pos;
		
	}
	public double HRA() {
		return 0.18*this.basicPay;
	}
	@Override
	public double calSal() {
		// TODO Auto-generated method stub
		double Salary = this.basicPay + HRA(); 
		return Salary;
	}
	@Override
	public String toString() {
		return "Staff [position=" + position + ", empId=" + empId + ", empName=" + empName + ", a1=" + a1
				+ ", basicPay=" + basicPay + ", availableLeaves=" + availableLeaves + "]";
	}
	
	

}