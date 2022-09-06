package com.sonata.assignment2;

public class Circle extends Shape{

	int radius;
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("area of Circle is "+(this.radius*this.radius)*3.14);
	}

}