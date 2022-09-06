package com.sonata.assignment2;

public class TechnicalEmployee extends Eployee{
	String techSkill;
	
	public TechnicalEmployee(){
		
	}
	public TechnicalEmployee(String techSkill){
		this.techSkill = techSkill;
	}
	public double HRA() {
		return 0.12*this.basicPay;
	}
	@Override
	public double calSal() {
		// TODO Auto-generated method stub
		double Salary = this.basicPay+HRA();
		return Salary;
	}
	@Override
	public String toString() {
		return "TechnicalEmployee [techSkill=" + techSkill + ", empId=" + empId + ", empName=" + empName + ", a1=" + a1
				+ ", basicPay=" + basicPay + ", availableLeaves=" + availableLeaves + "]";
	}
	
	
}