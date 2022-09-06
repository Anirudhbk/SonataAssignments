package com.sonata.assignment;

public class Products {
	int proID;
	String proName;
	double proPrice;
	Products(){}
	Products( int id , String name , double price ) {
		this.proID = id;
		this.proName = name;
		this.proPrice = price;
	}
	public double gstTax (double p) {
		double finalPrice = proPrice + (proPrice*0.18);
		return finalPrice;
	}
	public static void main(String[] args) {
		Products p1 = new Products( 1001 , "Guitar" , 5699);
		System.out.println( p1.proID + " - " + p1.proName + "\nPrice = " + p1.proPrice + "\n" + "GST = " + (p1.proPrice*0.18) + "\nFinal Price = " + p1.gstTax(p1.proPrice) );
	}
}
