package com.sonata.assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductCom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Product> pro = new ArrayList<>();
pro.add(new Product(10,"TV",45000));
pro.add(new Product(11,"Fridge",12000));
pro.add(new Product(13,"Mobile",20000));

Collections.sort(pro, (p1,p2)->p1.getProPrize()-p2.getProPrize());
pro.forEach(System.out::println);
	}

}
