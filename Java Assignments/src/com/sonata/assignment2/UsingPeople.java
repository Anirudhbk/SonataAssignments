package com.sonata.assignment2;

public class UsingPeople {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TechnicalEmployee t1 = new 	TechnicalEmployee();
	 	t1.empId=001;
	 	t1.basicPay=50000;
	 	t1.empName="Anirudh";
	 	t1.techSkill="C++";
	 	t1.availableLeaves = 14;
	  	Address techAddres = new Address(1,"bagalagunte",560073,"Bangalore"); 
	 	t1.a1= techAddres;
		System.out.println(t1);	
	 	
		
		Staff s1 = new Staff();
	 	s1.empId = 501;
	 	s1.empName="Kanika";
	 	s1.position="Sanitary staff";
	 	s1.availableLeaves= 4;
	 	s1.basicPay = 12500;
	 	Address staff1 = new Address(73,"Indhranagar",523117,"Mysore");
	    s1.a1  = staff1; 
	 	System.out.println(s1);
	}

}