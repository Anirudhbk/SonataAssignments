package com.sonata.assignmentCAR;

public class MyOwnAutoShop{
	public static void main(String args[]) {
		Car c1 = new Car(25,250000,"white");
		System.out.println(c1.getSalePrice());

		
		Truck t1 = new Truck(20,500,"red",2500);
	     System.out.println(t1.getSalePrice());
			
	     Truck t2 = new Truck(30,1000,"violet",1000);
	     System.out.println(t2.getSalePrice());
	     
		
	     Ford f1 =new Ford(50,50000,"Blue",2000,10000);
		System.out.println(f1.getSalePrice());
		
		Ford f2 = new Ford(30,15000,"Blue",2000,5000);
		System.out.println(f2.getSalePrice());
		
	     
	     Sedan s1 = new Sedan(20,500,"white",50);
			System.out.println(s1.getSalePrice());
			
			Sedan s2 =new Sedan(30,1500,"orange",10);
			System.out.println(s2.getSalePrice());
	
	}
}