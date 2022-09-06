package com.sonata.assignmentCAR;

public class Truck extends Car{
	int weight;

	public Truck (int Speed,double regularPrice,String color, int weight) {
	super(Speed,regularPrice,color);
	this.weight = weight;
	}

	public double getSalePrice() {
		int weight = this.weight;
		if (weight > 2000){
			return super.getSalePrice() - (0.1 * super.getSalePrice());
		}
		else {
			return super.getSalePrice()-(0.2*super.getSalePrice());
		}
	}
      
}
