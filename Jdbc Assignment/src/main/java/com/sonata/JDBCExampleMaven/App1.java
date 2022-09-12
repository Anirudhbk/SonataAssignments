package com.sonata.JDBCExampleMaven;

import com.sonata.DAOImpl.ProductImpl;
import com.sonata.Model.Product;

public class App1 {
public static void main(String[] args) {
		Product s1 = new Product();
		s1.setProductId(112);
		s1.setProductName("Ani");
		s1.setProductPrice(2355.55);
		ProductImpl e1 = new ProductImpl();
		int a = e1.save(s1);
		System.out.println(a);
			

	}



	
	}
