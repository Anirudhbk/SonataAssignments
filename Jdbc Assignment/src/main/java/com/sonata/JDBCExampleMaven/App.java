package com.sonata.JDBCExampleMaven;

import com.sonata.DAOImpl.EmployeeImpl;
import com.sonata.Model.Employee;

public class App {

	public static void main(String[] args) {
		
		
		Employee s1 = new Employee();
		s1.setEmpID(12);
		s1.setEmpName("Ani");
		s1.setEmpSal(5000);
		
		EmployeeImpl p1 = new EmployeeImpl();
		int a1 = p1.save(s1);
		System.out.println(a1);

	}

}
