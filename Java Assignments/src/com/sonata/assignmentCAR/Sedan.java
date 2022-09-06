package com.sonata.assignmentCAR;

public class Sedan extends Car{
	int length;
	public Sedan(int speed,double regularPrice,String color,int length) {
		super(speed,regularPrice,color);
		this.length = length;
	}
	
	public double getSalePrice() {
		int length = this.length;
		if(length>20) {
			return super.getSalePrice() - (0.5 * super.getSalePrice());
		}
		else
			return super.getSalePrice() - (0.1 * super.getSalePrice());
	}

}